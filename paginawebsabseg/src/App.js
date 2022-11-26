import './index.css';
import Banner from './Components/Banner/Banner';
import Header from './Components/Header/Header.jsx'
import Services from './Components/Services/Services';
import Productions from './Components/Productions/Productions.jsx'
import Contact from './Components/Contact/Contact.jsx'
import Footer from './Components/Footer/Footer.jsx'
import Navigation from './Components/Navigation/Navigation';


function App() {
  return (
    <div className="App">
      <>
        <Navigation/>
        <Header/>
        <Banner/>
        <Services/>
        <Productions/>
        <Contact/>
        <Footer/>
      </>
    </div>
  );
}

export default App;
