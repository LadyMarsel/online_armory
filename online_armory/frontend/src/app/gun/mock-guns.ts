import { Gun } from "./gun";

export const GUNS: Gun[] = [
    {
        id: 1,
        company: "glock 17",
        gunType: "revolver",
        firingMode: "semi-AUTO",
        gunCaliber: 9,
        name: "glock 17",
        country: "Allemagne",
        year: 1983,
        description: "Ceci est la description",
        img: "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sportsmansoutdoorsuperstore.com%2Fprodimages%2Falt_images%2Fg17-gen5-fs_2.jpg&f=1&nofb=1&ipt=ff50dac3b4ba84efd0943c64ae6b15d0dd8592e57660decc83e14b3d54f3a5cf&ipo=images",
        isForbidden: false,
        isFree: false,
        barelSize: 25,
        totalSize: 35,
    },
    {
        id: 2,
        company: "colt 1911",
        gunType: "pistolet",
        firingMode: "semi-AUTO",
        gunCaliber: 9,
        name: "Colt 1911",
        country: "État-Unis",
        year: 1911,
        description: "Ceci est la description",
        img: "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages.guns.com%2Fprod%2F2019%2F08%2F30%2F58-1991%2520GOVERNMENT-2940423-1.jpg%3Fimwidth%3D1200&f=1&nofb=1&ipt=8374226e916524737192f51aa66926930a87d8c66bb9d196079653ef92e25aa9&ipo=images",
        isForbidden: false,
        isFree: false,
        barelSize: 25,
        totalSize: 35,
    }
]