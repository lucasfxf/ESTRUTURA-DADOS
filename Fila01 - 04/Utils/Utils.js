export function getDataAtual() {
    const data = new Date();
    return data.toLocaleDateString();
}

export function getHoraAtual() {
    const data = new Date();
    return data.toLocaleTimeString();
}