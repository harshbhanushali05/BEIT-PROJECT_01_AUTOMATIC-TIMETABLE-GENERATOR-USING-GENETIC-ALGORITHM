// JScript source code
$(document).ready(function () {

  /*  $('.txtDate').datepicker(function(){
        format: 'dd-mm-yyyy'
    });*/
    
    $('.btnReset,button[type="reset"]').on('click',function(){
        debugger;
        $('input[type="text"],textarea').prop('disabled',false);
        $('input[type="text"],textarea').val('');
    });
    //debugger;
    $('.sign-out').on('click',function(){
        window.location.href="login.html";
    });
   // $("#formList,#permanentStaff,#tempStaff").niceScroll({ touchbehavior: false, cursorcolor: "#000", cursoropacitymax: 0.7, cursorwidth: 8, cursorborder: "1px solid #ccc", cursorborderradius: "5px", background: "#ccc" }); // MAC like scrollbar
   // $("#selectedForms,#selectedStaff,#selectedtstaff").niceScroll({ touchbehavior: false, cursorcolor: "#000", cursoropacitymax: 0.7, cursorwidth: 8, cursorborder: "1px solid #ccc", cursorborderradius: "5px", background: "#ccc"}); // MAC like scrollbar
    $('.accordion-heading').on('click',function(){
        $(this).siblings('.accordion-body').slideToggle();
        $(this).children('a').children('i').toggleClass('fa-plus-circle fa-minus-circle');
        $(this).parent().siblings().children('.accordion-body').slideUp();
        $(this).parent().siblings().children('.accordion-heading').children().children().addClass('fa-plus-circle');
        $(this).parent().siblings().children('.accordion-heading').children().children().removeClass('fa-minus-circle');
    });
    var p1=0;
    var p2=0;
    $('#addShow').on('click',function(){
        //debugger;
        //$('#addShowInfo input[type="text"]').each(function(){
        //    p1++;
        //    if($(this).val()==''){
        //        p2++
        //    }
        //});
        //if(p1==p2 || p2>0){
        //p1=0;p2=0;
        //}
         window.location.href = "other_information.html"; 
    });

    

    $('#addNewShow').on('click', function () {
        window.location.href = "add_show_details.html";
    });

    $('.exhibitorData').on('click',function(){
   // debugger;
        var data=$(this).html();
        $('#eName').html(data);
    });
   
});


//Form selection
function uncheckSelectAll(element) {
    if ($('#selectAll').is(':checked')) {
        if ($(element).is(':checked')) { }
        else {
            $('#selectAll').prop('checked', false);
        }
    }
    else {
    }
}

function selectAllForms() {
    if ($('#selectAll').is(':checked')) {

        $("#formList li:not(.hidden)").children('input[type="checkbox"]').prop('checked', true);
    }
    else {

        $("#formList li:not(.hidden)").children('input[type="checkbox"]').prop('checked', false);

    }
}

function addSelectedForms() {

    $('#formList').find('input[type="checkbox"]:checked').each(function () {
        if ($(this).attr('id') != 'selectAll') {
            var Id = $(this).attr('id').split('_')[2];
            var labelText = $(this).siblings('span').html();
            var li = "<li id='li_SelectedForm_" + Id + "'><span class='pull-left'>" + labelText + "</span><a href='javascript:;' onclick='return removeSelectedStore(" + Id + ");' class='pull-right' title='remove'><i class='fa fa-times-circle'></i></a></li>";
            $("#selectedForms").append(li);
            $('#li_AvailableForm_' + Id).remove();
        }
    });
    if ($("#formList").children('li').length == 0) {
        $('#selectAllForms').css("visibility", "hidden");
    }
    else {$('#selectAllForms').css("visibility", "visible");}

    if ($("#selectedForms").children('li').length == 0) {
        $('#removeAllForms').css("visibility", "hidden");
         $('#noforms').show();
    }
    else {
        $('#removeAllForms').css("visibility", "visible");
        $('#noforms').hide();
    }
    $('#selectAll').prop('checked', false);
    //setNoOfStoresAvailableInSpan();
}

function removeSelectedStore(Id) {

    var isSelectAllChecked = '';
    if ($('#selectAll').is(':checked')) {
        isSelectAllChecked = 'checked'
    }
    else {isSelectAllChecked = '';}
    $('#selectAllForms').css("visibility", "visible");

    var labelText = '';
    if (Id != -1) {
        labelText = $('#li_SelectedForm_' + Id).children('span').html();
        var li = '<li id="li_AvailableForm_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input  type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + isSelectAllChecked + ' id="chkBox_AvailableForm_' + Id + '"/></li>';
        $("#formList").append(li);
        $('#li_SelectedForm_' + Id).remove();

        if ($("#selectedForms").children('li').length == 0) {
            $('#removeAllForms').css("visibility", "hidden");
            $('#noforms').show();
        }
        else {
            $('#removeAllForms').css("visibility", "visible");
            $('#noforms').hide();
        }

    }
    else {
        $('#removeAllForms').css("visibility", "hidden");
        $('#noforms').show();
        $('#selectedForms').find('li').each(function () {

            if ($(this).attr('id') != 'li_RemoveAllForms') {
                Id = $(this).attr('id').split('_')[2];
                var labelText = $(this).children('span').html()
                var li = '<li id="li_AvailableForm_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + isSelectAllChecked + ' id="chkBox_AvailableForm_' + Id + '"/></li>';

                $("#formList").append(li);

            }
            $(this).remove();
        });

    }
    $('#formList>li').sort(sortEm).prependTo($('#formList'));
   // setNoOfStoresAvailableInSpan();
}

function sortEm(a, b) {
    return parseInt($('span', a).text()) > parseInt($('span', b).text()) ? 1 : -1;
}

//Staff selection
function addSelectedStaff(){
    //Permanent Staff
     $('#permanentStaff').find('input[type="checkbox"]:checked').each(function () {
        if ($(this).attr('id') != 'chk_AllStaff') {
            var Id = $(this).attr('id').split('_')[2];
            var labelText = $(this).siblings('span').html();
            var li = "<li id='li_SelectedStaff_" + Id + "'><span class='pull-left'>" + labelText + "</span><a href='javascript:;' onclick='return removeSelectedStaff(" + Id + ");' class='pull-right' title='remove'><i class='fa fa-times-circle'></i></a></li>";
            $("#selectedStaff").append(li);
            $('#li_pstaff_' + Id).remove();
        }
    });
    if ($("#permanentStaff").children('li').length == 0) {
        $('#selectAllStaff').css("visibility", "hidden");
    }
    else {
        $('#selectAllStaff').css("visibility", "visible");
    }

    if ($("#selectedStaff").children('li').length == 0) {
        $('#removeAllStaff').css("visibility", "hidden");
         $('#noStaff').show();
    }
    else {
        $('#removeAllStaff').css("visibility", "visible");
        $('#noStaff').hide();
    }
    $('#chk_AllStaff').prop('checked', false);
    
    //Temporary staff
    
    $('#tempStaff').find('input[type="checkbox"]:checked').each(function () {
        if ($(this).attr('id') != 'chk_alltstaff') {
            var Id = $(this).attr('id').split('_')[2];
            var labelText = $(this).siblings('span').html();
            var li = "<li id='li_SelectedtStaff_" + Id + "'><span class='pull-left'>" + labelText + "</span><a href='javascript:;' onclick='return removeSelectedtstaff(" + Id + ");' class='pull-right' title='remove'><i class='fa fa-times-circle'></i></a></li>";
            $("#selectedtstaff").append(li);
            $('#li_tstaff_' + Id).remove();
        }
    });
    if ($("#tempStaff").children('li').length == 0) {
        $('#selectAlltstaff').css("visibility", "hidden");
    }
    else {
        $('#selectAlltstaff').css("visibility", "visible");
    }

    if ($("#selectedtstaff").children('li').length == 0) {
        $('#removeAlltstaff').css("visibility", "hidden");
         $('#notstaff').show();
    }
    else {
        $('#removeAlltstaff').css("visibility", "visible");
        $('#notstaff').hide();
    }
    $('#chk_alltstaff').prop('checked', false);
    
}

function uncheckSelectAll(element) {
    //Permanent Staff
    if ($('#chk_AllStaff').is(':checked')) {
        if ($(element).is(':checked')) { }
        else {
            $('#chk_AllStaff').prop('checked', false);
        }
    }
    else {
    }
    
    //Temporary Staff
    if ($('#chk_alltstaff').is(':checked')) {
        if ($(element).is(':checked')) { }
        else {
            $('#chk_alltstaff').prop('checked', false);
        }
    }
    else {
    }
}

function selectAllStaffs() {
    //Permanent Staff
    if ($('#chk_AllStaff').is(':checked')) {

        $("#permanentStaff li:not(.hidden)").children('input[type="checkbox"]').prop('checked', true);
    }
    else {

        $("#permanentStaff li:not(.hidden)").children('input[type="checkbox"]').prop('checked', false);

    }

    //Temporary Staff
    if ($('#chk_alltstaff').is(':checked')) {

        $("#tempStaff li:not(.hidden)").children('input[type="checkbox"]').prop('checked', true);
    }
    else {

        $("#tempStaff li:not(.hidden)").children('input[type="checkbox"]').prop('checked', false);

    }

}

function removeSelectedStaff(Id) {
    //Permanent Staff
    var isSelectAllChecked = '';
    if ($('#chk_AllStaff').is(':checked')) {
        isSelectAllChecked = 'checked'
    }
    else {isSelectAllChecked = '';}
    $('#selectAllStaff').css("visibility", "visible");

    var labelText = '';
    if (Id != -1) {
        labelText = $('#li_SelectedStaff_' + Id).children('span').html();
        var li = '<li id="li_pstaff_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input  type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + isSelectAllChecked + ' id="Checkbox_pstaff_' + Id + '"/></li>';
        $("#permanentStaff").append(li);
        $('#li_SelectedStaff_' + Id).remove();

        if ($("#selectedStaff").children('li').length == 0) {
            $('#removeAllStaff').css("visibility", "hidden");
            $('#noStaff').show();
        }
        else {
            $('#removeAllStaff').css("visibility", "visible");
            $('#noStaff').hide();
        }

    }
    else {
        $('#removeAllStaff').css("visibility", "hidden");
        $('#noStaff').show();
        $('#selectedStaff').find('li').each(function () {

            if ($(this).attr('id') != 'li_RemoveAllForms') {
                Id = $(this).attr('id').split('_')[2];
                var labelText = $(this).children('span').html()
                var li = '<li id="li_pstaff_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + isSelectAllChecked + ' id="Checkbox_pstaff_' + Id + '"/></li>';

                $("#permanentStaff").append(li);

            }
            $(this).remove();
        });

    }
    $('#permanentStaff>li').sort(sortEm).prependTo($('#permanentStaff'));
   // setNoOfStoresAvailableInSpan();
   
   
}

function removeSelectedtstaff(Id){
//Temporary Staff
   var istSelectAllChecked = '';
    if ($('#chk_alltstaff').is(':checked')) {
        istSelectAllChecked = 'checked'
    }
    else {istSelectAllChecked = '';}
    $('#selectAlltstaff').css("visibility", "visible");

    var labelText = '';
    if (Id != -1) {
        labelText = $('#li_SelectedtStaff_' + Id).children('span').html();
        var li = '<li id="li_tstaff_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input  type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + istSelectAllChecked + ' id="Checkbox_tstaff_' + Id + '"/></li>';
        $("#tempStaff").append(li);
        $('#li_SelectedtStaff_' + Id).remove();

        if ($("#selectedtstaff").children('li').length == 0) {
            $('#removeAlltstaff').css("visibility", "hidden");
            $('#notstaff').show();
        }
        else {
            $('#removeAlltstaff').css("visibility", "visible");
            $('#notstaff').hide();
        }

    }
    else {
        $('#removeAlltstaff').css("visibility", "hidden");
        $('#notStaff').show();
        $('#selectedtstaff').find('li').each(function () {

            if ($(this).attr('id') != 'li_RemoveAllForms') {
                Id = $(this).attr('id').split('_')[2];
                var labelText = $(this).children('span').html()
                var li = '<li id="li_tstaff_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + istSelectAllChecked + ' id="Checkbox_tstaff_' + Id + '"/></li>';

                $("#tempStaff").append(li);

            }
            $(this).remove();
        });

    }
    $('#tempStaff>li').sort(sortEm).prependTo($('#tempStaff'));
   // setNoOfStoresAvailableInSpan();
}

//Services selection
function uncheckSelectAll(element) {
    if ($('#selectAll').is(':checked')) {
        if ($(element).is(':checked')) { }
        else {
            $('#selectAll').prop('checked', false);
        }
    }
    else {
    }
}

function selectAllForms() {
    if ($('#selectAll').is(':checked')) {

        $("#serviceList li:not(.hidden)").children('input[type="checkbox"]').prop('checked', true);
    }
    else {

        $("#serviceList li:not(.hidden)").children('input[type="checkbox"]').prop('checked', false);

    }
}

function addSelectedServices() {

    $('#serviceList').find('input[type="checkbox"]:checked').each(function () {
        if ($(this).attr('id') != 'selectAll') {
            var Id = $(this).attr('id').split('_')[2];
            var labelText = $(this).siblings('span').html();
            var li = "<li id='li_SelectedService_" + Id + "'><span class='pull-left'>" + labelText + "</span><a href='javascript:;' onclick='return removeSelectedService(" + Id + ");' class='pull-right' title='remove'><i class='fa fa-times-circle'></i></a></li>";
            $("#selectedServices").append(li);
            $('#li_AvailableService_' + Id).remove();
        }
    });
    if ($("#serviceList").children('li').length == 0) {
        $('#selectAllServices').css("visibility", "hidden");
    }
    else {$('#selectAllServices').css("visibility", "visible");}

    if ($("#selectedServices").children('li').length == 0) {
        $('#removeAllServices').css("visibility", "hidden");
         $('#noservices').show();
    }
    else {
        $('#removeAllServices').css("visibility", "visible");
        $('#noservices').hide();
    }
    $('#selectAll').prop('checked', false);
    //setNoOfStoresAvailableInSpan();
}

function removeSelectedService(Id) {

    var isSelectAllChecked = '';
    if ($('#selectAll').is(':checked')) {
        isSelectAllChecked = 'checked'
    }
    else {isSelectAllChecked = '';}
    $('#selectAllServices').css("visibility", "visible");

    var labelText = '';
    if (Id != -1) {
        labelText = $('#li_SelectedService_' + Id).children('span').html();
        var li = '<li id="li_AvailableService_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input  type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + isSelectAllChecked + ' id="chkBox_AvailableService_' + Id + '"/></li>';
        $("#serviceList").append(li);
        $('#li_SelectedService_' + Id).remove();

        if ($("#selectedServices").children('li').length == 0) {
            $('#removeAllServices').css("visibility", "hidden");
            $('#noservices').show();
        }
        else {
            $('#removeAllServices').css("visibility", "visible");
            $('#noservices').hide();
        }

    }
    else {
        $('#removeAllServices').css("visibility", "hidden");
        $('#noservices').show();
        $('#selectedServices').find('li').each(function () {

            if ($(this).attr('id') != 'li_RemoveAllServices') {
                Id = $(this).attr('id').split('_')[2];
                var labelText = $(this).children('span').html()
                var li = '<li id="li_AvailableService_' + Id + '"><span class="pull-left" ' + Id + '>' + labelText + '</span><input type="checkbox" class="pull-right" onclick="return uncheckSelectAll(this);"' + isSelectAllChecked + ' id="chkBox_AvailableService_' + Id + '"/></li>';

                $("#serviceList").append(li);

            }
            $(this).remove();
        });

    }
    $('#serviceList>li').sort(sortEm).prependTo($('#serviceList'));
   // setNoOfStoresAvailableInSpan();
}