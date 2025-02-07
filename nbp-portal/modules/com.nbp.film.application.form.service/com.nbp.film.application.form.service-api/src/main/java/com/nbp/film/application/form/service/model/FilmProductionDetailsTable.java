/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_production_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetails
 * @generated
 */
public class FilmProductionDetailsTable
	extends BaseTable<FilmProductionDetailsTable> {

	public static final FilmProductionDetailsTable INSTANCE =
		new FilmProductionDetailsTable();

	public final Column<FilmProductionDetailsTable, Long>
		filmProductionDetailsId = createColumn(
			"filmProductionDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmProductionDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> productionTitle =
		createColumn(
			"productionTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String>
		totalProductionBudget = createColumn(
			"totalProductionBudget", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String>
		expenditureInJamaica = createColumn(
			"expenditureInJamaica", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> foreignPersonnel =
		createColumn(
			"foreignPersonnel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> jamaicanPersonnel =
		createColumn(
			"jamaicanPersonnel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> productionType =
		createColumn(
			"productionType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> fixerName =
		createColumn(
			"fixerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> fixerMobile =
		createColumn(
			"fixerMobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String> fixerEmail =
		createColumn(
			"fixerEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Date> preProductionDates =
		createColumn(
			"preProductionDates", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Date> productionDates =
		createColumn(
			"productionDates", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Date> productionStartDate =
		createColumn(
			"productionStartDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Date> productionEndDate =
		createColumn(
			"productionEndDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String>
		proposedProductionLocations = createColumn(
			"proposedProductionLocations", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String>
		productionInternationalCrew = createColumn(
			"productionInternationalCrew", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String>
		productionjamaicanCrew = createColumn(
			"productionjamaicanCrew", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, String>
		productionExternalPermit = createColumn(
			"productionExternalPermit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmProductionDetailsTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmProductionDetailsTable() {
		super("nbp_film_production_details", FilmProductionDetailsTable::new);
	}

}