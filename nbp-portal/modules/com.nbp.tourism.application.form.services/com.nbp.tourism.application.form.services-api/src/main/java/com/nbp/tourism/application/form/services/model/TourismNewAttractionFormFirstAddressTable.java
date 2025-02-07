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
 * The table class for the &quot;nbp_tourism_new_attract_ffaoo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddress
 * @generated
 */
public class TourismNewAttractionFormFirstAddressTable
	extends BaseTable<TourismNewAttractionFormFirstAddressTable> {

	public static final TourismNewAttractionFormFirstAddressTable INSTANCE =
		new TourismNewAttractionFormFirstAddressTable();

	public final Column<TourismNewAttractionFormFirstAddressTable, Long>
		tourismNewAttractionFormFAOOId = createColumn(
			"tourismNewAttractionFormFAOOId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAttractionFormFirstAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, String>
		attractionAddress = createColumn(
			"attractionAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, String>
		attractionTelephoneNumber = createColumn(
			"attractionTelephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, String>
		attractionFaxNumber = createColumn(
			"attractionFaxNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, String>
		attractionEmail = createColumn(
			"attractionEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstAddressTable, Long>
		tourismNewAttractFormFirstId = createColumn(
			"tourismNewAttractFormFirstId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAttractionFormFirstAddressTable() {
		super(
			"nbp_tourism_new_attract_ffaoo",
			TourismNewAttractionFormFirstAddressTable::new);
	}

}