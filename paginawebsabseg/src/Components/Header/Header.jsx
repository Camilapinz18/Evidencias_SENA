import './header.css'
import img_header from '../../Images/imagen_header.png'

const Header = () => {
    return (
        <section id="#header">
            
            <div className="header_container">
                <div className='header_text'>
                    <h2>Lleva tus sesiones de ensayo</h2>
                    <h3>a otro nivel</h3>
                </div>
                <a href="#services" className='btn services_btn'>Conócenos</a>
            </div>
        </section>
    )
}

export default Header