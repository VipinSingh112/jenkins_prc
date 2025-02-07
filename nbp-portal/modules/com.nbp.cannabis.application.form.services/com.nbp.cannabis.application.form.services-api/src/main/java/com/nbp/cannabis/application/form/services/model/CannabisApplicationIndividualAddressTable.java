/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_ind_address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddress
 * @generated
 */
public class CannabisApplicationIndividualAddressTable
	extends BaseTable<CannabisApplicationIndividualAddressTable> {

	public static final CannabisApplicationIndividualAddressTable INSTANCE =
		new CannabisApplicationIndividualAddressTable();

	public final Column<CannabisApplicationIndividualAddressTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Long>
		IndividualAddressId = createColumn(
			"IndividualAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationIndividualAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, String>
		streetName = createColumn(
			"streetName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, String>
		town = createColumn(
			"town", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, String>
		parish = createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationIndividualAddressTable, Long>
		individualInformationId = createColumn(
			"individualInformationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisApplicationIndividualAddressTable() {
		super(
			"nbp_cannabis_ind_address",
			CannabisApplicationIndividualAddressTable::new);
	}

}