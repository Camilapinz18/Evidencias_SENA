import './services.css'
import salaensayo2 from '../../Images/salaensayo2.png'
import produccion from '../../Images/produccion.png'
import grabacion from '../../Images/grabacion.png'
import alquiler from '../../Images/alquiler.png'
import tarima from '../../Images/tarima.png'

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
                            <a href='#services' className='btn btn_reserva'>Reserva</a>
                        </div>
                        <div className='imagen'>                 
                            <img src={salaensayo2}></img>
                        </div>
                    </div>

                    <div className='service'>
                        <div className='service_info'>
                            <h2>Salas de ensayo</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis eget dolor at ullamcorper. Suspendisse diam orci, porttitor vel scelerisque id, tincidunt et dolor. Mauris eleifend nisl ac nibh vulputate luctus. </p>
                            <a href='#services' className='btn btn_reserva'>Reserva</a>
                        </div>
                        <div className='imagen'>                 
                            <img src={produccion}></img>
                        </div>
                    </div>

                    <div className='service'>
                        <div className='service_info'>
                            <h2>Salas de ensayo</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis eget dolor at ullamcorper. Suspendisse diam orci, porttitor vel scelerisque id, tincidunt et dolor. Mauris eleifend nisl ac nibh vulputate luctus. </p>
                            <a href='#services' className='btn btn_reserva'>Reserva</a>
                        </div>
                        <div className='imagen'>                 
                            <img src={grabacion}></img>
                        </div>
                    </div>

                    <div className='service'>
                        <div className='service_info'>
                            <h2>Salas de ensayo</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis eget dolor at ullamcorper. Suspendisse diam orci, porttitor vel scelerisque id, tincidunt et dolor. Mauris eleifend nisl ac nibh vulputate luctus. </p>
                            <a href='#services' className='btn btn_reserva'>Reserva</a>
                        </div>
                        <div className='imagen'>                 
                            <img src={alquiler}></img>
                        </div>
                    </div>

                    <div className='service'>
                        <div className='service_info'>
                            <h2>Salas de ensayo</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis eget dolor at ullamcorper. Suspendisse diam orci, porttitor vel scelerisque id, tincidunt et dolor. Mauris eleifend nisl ac nibh vulputate luctus. </p>
                            <a href='#services' className='btn btn_reserva'>Reserva</a>
                        </div>
                        <div className='imagen'>                 
                            <img src={tarima}></img>
                        </div>
                    </div>
                </div>

            </div>

        </section>
    )
}

export default Services