import './footer.css'
import logo from '../../Images/Nombre.png'
import instagram from '../../iconos/instagram_96px.png'
import fb from '../../iconos/facebook_96px.png'
import youtube from '../../iconos/youtube.png'
import whatsapp from '../../iconos/whatsapp_96px.png'
import location from '../../iconos/user_location_96px.png'
import phone from '../../iconos/phone_96px.png'

const Footer = () => {
    return (
        <section id='#footer'>
            <div className='footer_container'>
                <img src={logo} alt='logo' />
                <div className='footer_info'>
                    <div className='info_box'>
                        <img src={location} />
                        <div className='info_box_text'>
                            <h4>Dirección</h4>
                            <h5>Cra 45 #19-65</h5>
                            <h5>Bogotá</h5>
                            <h5>Colombia</h5>
                        </div>

                    </div>

                    <div className='info_box'>
                        <img src={phone} />
                        <div className='info_box_text'>
                            <h4>Teléfono</h4>
                            <h5>+57 301 510 6397</h5>
                            <h5>60158231</h5>
                        </div>
                    </div>
                </div>


                <div className='footer_icons'>
                    <a
                        href='instagram.com'>
                        <img src={instagram} />
                    </a>
                    <a
                        href='fb.com'>
                        <img src={fb} />
                    </a>
                    <a
                        href='youtube.com'>
                        <img src={youtube} />
                    </a>
                    <a
                        href='whatsapp.com'>
                        <img src={whatsapp} />
                    </a>

                </div>
            </div>

        </section>
    )
}

export default Footer