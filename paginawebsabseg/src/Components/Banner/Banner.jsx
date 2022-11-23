import './banner.css'
import shure from '../../Images/dlf.pt-shure-logo-png-3384447.png'
import akg from '../../Images/akg.png'
import sennheiser from '../../Images/sennheiser.png'
import orange from '../../Images/orange.png'
import marshall from '../../Images/marshall.png'



const Banner=()=>{
    return(
        <section id='#banner'>
            <div className="banner_container">
                <img src={shure} alt='shure_logo' className='img_shure'/>
                <img src={akg} alt='akg_logo' className='img_akg'/>
                <img src={sennheiser} alt='sennheiser_logo' className='img_sennheiser'/>
                <img src={orange} alt='orange_logo' className=' img_orange'/>
                <img src={marshall} alt='marshall_logo' className='img_marshall'/>
            </div>
        </section>
    )
}

export default Banner