/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_boma_acco_faoo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddress
 * @generated
 */
public class TourismBonaAccommodationFormAddressTable
	extends BaseTable<TourismBonaAccommodationFormAddressTable> {

	public static final TourismBonaAccommodationFormAddressTable INSTANCE =
		new TourismBonaAccommodationFormAddressTable();

	public final Column<TourismBonaAccommodationFormAddressTable, Long>
		tourismBonaAccommodationFAOOId = createColumn(
			"tourismBonaAccommodationFAOOId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAccommodationFormAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, String>
		bonaAccoAddress = createColumn(
			"bonaAccoAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, String>
		bonaAccoTelephoneNumber = createColumn(
			"bonaAccoTelephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, String>
		bonaAccoFaxNumber = createColumn(
			"bonaAccoFaxNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, String>
		bonaAccoEmail = createColumn(
			"bonaAccoEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormAddressTable, Long>
		tourismBonaAFId = createColumn(
			"tourismBonaAFId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private TourismBonaAccommodationFormAddressTable() {
		super(
			"nbp_tourism_boma_acco_faoo",
			TourismBonaAccommodationFormAddressTable::new);
	}

}