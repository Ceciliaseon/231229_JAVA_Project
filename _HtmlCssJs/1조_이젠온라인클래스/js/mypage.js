let year = 2024;
    let monthTime = document.querySelector('.month_time_de');
    let studyTime = document.querySelector('.study_time_de');
    let noteDe = document.querySelector('.note_de');
    function decreaseYear(){
      year--;
      document.querySelector('.midyear').innerHTML=year+"년";
      if(year==2023){
        monthTime.innerHTML='63분';
        studyTime.innerHTML='200일 3시간 10분';
        noteDe.innerHTML = '27개';
      } else if(year==2022){
        monthTime.innerHTML='58분';
        studyTime.innerHTML='173일 8시간 43분';
        noteDe.innerHTML = '19개';
      } else {
        monthTime.innerHTML='';
        studyTime.innerHTML='';
        noteDe.innerHTML = '';
      }
    }
    function increaseYear(){
      year++;
      if(year>=2024){
        year=2024;
        monthTime.innerHTML='33분';
        studyTime.innerHTML='10시간 52분';
        noteDe.innerHTML = '3개';
      } else if(year==2023){
        monthTime.innerHTML='63분';
        studyTime.innerHTML='200일 3시간 10분';
        noteDe.innerHTML = '27개';
      } else if(year==2022){
        monthTime.innerHTML='58분';
        studyTime.innerHTML='173일 8시간 43분';
        noteDe.innerHTML = '19개';
      }
      document.querySelector('.midyear').innerHTML=year+"년";
    }