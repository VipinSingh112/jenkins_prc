/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_ida&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddress
 * @generated
 */
public class CreativeIndividualDetailsAddressTable
	extends BaseTable<CreativeIndividualDetailsAddressTable> {

	public static final CreativeIndividualDetailsAddressTable INSTANCE =
		new CreativeIndividualDetailsAddressTable();

	public final Column<CreativeIndividualDetailsAddressTable, Long>
		creativeIndiDetailsAddressId = createColumn(
			"creativeIndiDetailsAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeIndividualDetailsAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, String>
		streetAddress = createColumn(
			"streetAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, String>
		streetAddressLineTwo = createColumn(
			"streetAddressLineTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualDetailsAddressTable, Long>
		creativeIndividualDetailsId = createColumn(
			"creativeIndividualDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeIndividualDetailsAddressTable() {
		super("nbp_creative_ida", CreativeIndividualDetailsAddressTable::new);
	}

}