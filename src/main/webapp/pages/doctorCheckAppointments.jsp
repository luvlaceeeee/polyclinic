<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Doctor</title>
  <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/style.css">
</head>
<body style="height: 100Vh">

<%@include file="header.jsp" %>
<%@include file="buttons.jsp" %>

<div class="for_caption" style="margin: 40px"><h1 class="caption">Appointments</h1></div>

<div class="scrollit">
  <div class="list-div">
    <table style="width: 100%">
      <thead class="thead-list">
      <tr>
        <td>Appointment</td>
        <td>Action</td>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${appointmentsDoctor}" var="appointment">
        <tr>
          <form action="doctorCheckCard" method="post">
            <td><div class="user">
              <b>Patient name: </b><span class="name"><c:out value="${appointment.getPatient().getName()}"/></span> <br>
              <b>Date from</b> <input name="from" type="datetime-local" value="<c:out value="${appointment.getFromTime()}"/>" style="font-size: 15px; width: auto; text-align: center;" disabled>  <br>
              <b>Date to</b> <input name="to" type="datetime-local" value="<c:out value="${appointment.getToTime()}"/>" style="font-size: 15px; width: auto; text-align: center;" disabled>  <br>
              <div hidden><b>patient id</b> <input name="patient_id" value="<c:out value="${appointment.getPatient().getId()}"/>" style="font-size: 15px; width: auto; text-align: center;" disabled>  <br>
              </div>
            </div></td>

            <td>
              <input class="default-button" type="submit" value="Check card"></form>
            </td>

        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</div>