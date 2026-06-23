using System;
using System.Collections.Generic;

class Labirinto
{
    private const int limit = 10;

    static void mostrarLabirinto(char[,] array)
    {
        for (int i = 0; i < limit; i++)
        {
            Console.WriteLine();
            for (int j = 0; j < limit; j++)
            {
                Console.Write($" {array[i, j]} ");
            }
        }
        Console.WriteLine();
    }

    static void criarLabirinto(char[,] meuLab)
    {
        Random random = new Random();

        for (int i = 0; i < limit; i++)
        {
            for (int j = 0; j < limit; j++)
            {
                meuLab[i, j] = random.Next(4) == 1 ? '|' : '.';
            }
        }

        for (int i = 0; i < limit; i++)
        {
            meuLab[0, i] = '*';
            meuLab[limit - 1, i] = '*';
            meuLab[i, 0] = '*';
            meuLab[i, limit - 1] = '*';
        }

        int x = random.Next(1, limit - 1);
        int y = random.Next(1, limit - 1);
        meuLab[x, y] = 'Q';
    }

    static bool procurarQueijo(char[,] lab, int startX, int startY)
    {
        Stack<(int x, int y)> pilha = new Stack<(int, int)>();

        pilha.Push((startX, startY));

        while (pilha.Count > 0)
        {
            var topo = pilha.Peek();
            int x = topo.x;
            int y = topo.y;

            if (lab[x, y] == 'Q')
            {
                Console.WriteLine("\nQueijo encontrado!");
                return true;
            }

            if (lab[x, y] == '.')
            {
                lab[x, y] = 'o';
            }

            bool moveu = false;

            if (lab[x, y + 1] == '.' || lab[x, y + 1] == 'Q')
            {
                pilha.Push((x, y + 1));
                moveu = true;
            }
            else if (lab[x + 1, y] == '.' || lab[x + 1, y] == 'Q')
            {
                pilha.Push((x + 1, y));
                moveu = true;
            }
            else if (lab[x, y - 1] == '.' || lab[x, y - 1] == 'Q')
            {
                pilha.Push((x, y - 1));
                moveu = true;
            }
            else if (lab[x - 1, y] == '.' || lab[x - 1, y] == 'Q')
            {
                pilha.Push((x - 1, y));
                moveu = true;
            }

            if (!moveu)
            {
                if (lab[x, y] != 'Q')
                    lab[x, y] = 'x';

                pilha.Pop();
            }
        }

        return false;
    }

    static void Main(string[] args)
    {
        char[,] meuLabirinto = new char[limit, limit];
        criarLabirinto(meuLabirinto);
        mostrarLabirinto(meuLabirinto);

        Console.WriteLine("\nPosições iniciais (linha e coluna):");
        int posX = Convert.ToInt32(Console.ReadLine());
        int posY = Convert.ToInt32(Console.ReadLine());
        
        if (meuLabirinto[posX, posY] != '.')
    {
        Console.WriteLine("Posição inicial inválida!");
        return;
    }

    bool encontrou = procurarQueijo(meuLabirinto, posX, posY);

    Console.WriteLine("\nResultado final:");
    mostrarLabirinto(meuLabirinto);

    if (!encontrou)
    {
    Console.WriteLine("\nNão foi possível encontrar o queijo.");
    }

    }
}