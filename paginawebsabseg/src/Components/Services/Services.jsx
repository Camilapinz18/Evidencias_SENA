import './services.css'
import salaensayo from '../../Images/sala ensayo.png'

const Services = () => {
    return (
        <section id='#services'>
            <div className="services_container">
                <h1>Servicios</h1>

                <div className='services_list'>
                    <div className='service'>
                        <div className='service_info'>
                            <h2>Salas de ensayo</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis eget dolor at ullamcorper. Suspendisse diam orci, porttitor vel scelerisque id, tincidunt et dolor. Mauris eleifend nisl ac nibh vulputate luctus. </p>
                        </div>
                        <div className='imagen'>
                            <h1>Aca va una imgaen</h1>
                        </div>
                        {/*<img src={salaensayo} alt='sala de ensayo' className="img_sala"/>*/}


                    </div>

                </div>

            </div>

        </section>
    )
}

export default Services