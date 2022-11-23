import './prodcutions.css'
import disc1 from '../../Images/disc1.jpg'
import disc2 from '../../Images/disc2.jpeg'
import disc3 from '../../Images/disc3.jpeg'
import disc4 from '../../Images/disc4.jpeg'

const Productions = () => {
    return (
        <section id='#productions'>
            <div className="productions_container">
                <div className='production'>
                    <img src={disc1} alt='caratula1' />
                    <div className='production_info'>
                        <h1>Ready to die</h1>
                        <h3>The notorius big</h3>
                        <h4>2022</h4>
                        <a href='' className='btn'>Escuchar</a>
                    </div>
                </div>

                <div className='production'>
                    <img src={disc2} alt='caratula1' />
                    <div className='production_info'>
                        <h1>Old town</h1>
                        <h3>Wongtuek Band</h3>
                        <h4>2022</h4>
                        <a href='https://www.youtube.com/' className='btn'>Escuchar</a>
                    </div>
                </div>

                <div className='production'>
                    <img src={disc3} alt='caratula1' />
                    <div className='production_info'>
                        <h1>The forest</h1>
                        <h3>Luca Robinson</h3>
                        <h4>2021</h4>
                        <a href='https://www.youtube.com/' className='btn btn_listen'>Escuchar</a>
                    </div>
                </div>

                <div className='production'>
                    <img src={disc4} alt='caratula1' />
                    <div className='production_info'>
                        <h1>Help grips</h1>
                        <h3>Hands in hell</h3>
                        <h4>2021</h4>
                        <a href='https://www.youtube.com/' className='btn'>Escuchar</a>
                    </div>
                </div>








            </div>

        </section>
    )
}

export default Productions