import './navigation.css'
import logo from '../../Images/Nombre.png'

const Navigation = () => {
    return (
        <section id="#navigation">

            <div className='navigation_container'>
                <img src={logo} alt='logo' className='logo'></img>
                <div className="navigation_links">
                    <a href="#header" className="link">Inicio</a>
                    <a href="#services" className="link">Servicios</a>
                    <a href="#productions" className="link">Producciones</a>
                    <a href="#contact" className="link">Contacto</a>
                </div>
                <a href='' className='btn login_btn'>Iniciar sesion</a>
            </div>
        </section>
    )
}

export default Navigation