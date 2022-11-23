import './contact.css'
import plano from '../../Images/plano.png'

const Contact = () => {
    return (
        <section id='#contact'>
            <div className="contact_container">
                <img src={plano} alt='ubicacion' />
                <div className='contact_forms'>
                    <h1>Contactanos</h1>
                    <form>
                        <input />
                    </form>
                    <form>
                        <input />
                    </form>
                    <form>
                        <input />
                    </form>
                    <form>
                        <input />
                    </form>
                    <a href='gmail.com' className='btn btn_contact'>Contactar</a>
                </div>


            </div>

        </section>
    )
}

export default Contact