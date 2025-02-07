/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_register&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegister
 * @generated
 */
public class FilmApplicationRegisterTable
	extends BaseTable<FilmApplicationRegisterTable> {

	public static final FilmApplicationRegisterTable INSTANCE =
		new FilmApplicationRegisterTable();

	public final Column<FilmApplicationRegisterTable, Long>
		filmApplicationRegisterId = createColumn(
			"filmApplicationRegisterId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmApplicationRegisterTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date> registrationDate =
		createColumn(
			"registrationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		filmRegistrationNum = createColumn(
			"filmRegistrationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		titleOfProduction = createColumn(
			"titleOfProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date> dateOfIssued =
		createColumn(
			"dateOfIssued", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		productionCompany = createColumn(
			"productionCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		technicalFormOfProd = createColumn(
			"technicalFormOfProd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> OriginOfProdCom =
		createColumn(
			"OriginOfProdCom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> permitsRequired =
		createColumn(
			"permitsRequired", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		shootLocationInJamaica = createColumn(
			"shootLocationInJamaica", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date> preProductionDate =
		createColumn(
			"preProductionDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date>
		productionStartDate = createColumn(
			"productionStartDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		proposedDateOfArrival = createColumn(
			"proposedDateOfArrival", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> portOfEntry =
		createColumn(
			"portOfEntry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, Date>
		proposedDateOfDeparture = createColumn(
			"proposedDateOfDeparture", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		fullProductionBudget = createColumn(
			"fullProductionBudget", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		expectedBudgetSpendInJA = createColumn(
			"expectedBudgetSpendInJA", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		numberOFForeignCrewHired = createColumn(
			"numberOFForeignCrewHired", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		numberJamaicaCrewHired = createColumn(
			"numberJamaicaCrewHired", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		valueOfBondWaiver = createColumn(
			"valueOfBondWaiver", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String> customsBroker =
		createColumn(
			"customsBroker", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationRegisterTable, String>
		localProductionManagerOrFixer = createColumn(
			"localProductionManagerOrFixer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private FilmApplicationRegisterTable() {
		super("nbp_film_register", FilmApplicationRegisterTable::new);
	}

}