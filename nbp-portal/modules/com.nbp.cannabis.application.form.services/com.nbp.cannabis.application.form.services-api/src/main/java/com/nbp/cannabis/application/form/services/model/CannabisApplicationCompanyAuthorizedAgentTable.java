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
 * The table class for the &quot;nbp_cannabis_caa&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAuthorizedAgent
 * @generated
 */
public class CannabisApplicationCompanyAuthorizedAgentTable
	extends BaseTable<CannabisApplicationCompanyAuthorizedAgentTable> {

	public static final CannabisApplicationCompanyAuthorizedAgentTable
		INSTANCE = new CannabisApplicationCompanyAuthorizedAgentTable();

	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Long>
		cannabisCOAId = createColumn(
			"cannabisCOAId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		firstName = createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		middleName = createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		surname = createColumn(
			"surname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		position = createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		gender = createColumn(
			"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Date>
		dateOfBirth = createColumn(
			"dateOfBirth", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		contactPhoneNumber = createColumn(
			"contactPhoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, String>
		emailAddress = createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAuthorizedAgentTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisApplicationCompanyAuthorizedAgentTable() {
		super(
			"nbp_cannabis_caa",
			CannabisApplicationCompanyAuthorizedAgentTable::new);
	}

}