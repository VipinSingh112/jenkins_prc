/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosiveIssuanceOfLicence. This utility wraps
 * <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveIssuanceOfLicenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicenceLocalService
 * @generated
 */
public class ExplosiveIssuanceOfLicenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveIssuanceOfLicenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosive issuance of licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 * @return the explosive issuance of licence that was added
	 */
	public static ExplosiveIssuanceOfLicence addExplosiveIssuanceOfLicence(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return getService().addExplosiveIssuanceOfLicence(
			explosiveIssuanceOfLicence);
	}

	/**
	 * Creates a new explosive issuance of licence with the primary key. Does not add the explosive issuance of licence to the database.
	 *
	 * @param issuanceId the primary key for the new explosive issuance of licence
	 * @return the new explosive issuance of licence
	 */
	public static ExplosiveIssuanceOfLicence createExplosiveIssuanceOfLicence(
		long issuanceId) {

		return getService().createExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the explosive issuance of licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 */
	public static ExplosiveIssuanceOfLicence deleteExplosiveIssuanceOfLicence(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return getService().deleteExplosiveIssuanceOfLicence(
			explosiveIssuanceOfLicence);
	}

	/**
	 * Deletes the explosive issuance of licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 * @throws PortalException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence deleteExplosiveIssuanceOfLicence(
			long issuanceId)
		throws PortalException {

		return getService().deleteExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ExplosiveIssuanceOfLicence fetchExplosiveIssuanceOfLicence(
		long issuanceId) {

		return getService().fetchExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * Returns the explosive issuance of licence matching the UUID and group.
	 *
	 * @param uuid the explosive issuance of licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence
		fetchExplosiveIssuanceOfLicenceByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchExplosiveIssuanceOfLicenceByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive issuance of licence with the primary key.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence
	 * @throws PortalException if a explosive issuance of licence with the primary key could not be found
	 */
	public static ExplosiveIssuanceOfLicence getExplosiveIssuanceOfLicence(
			long issuanceId)
		throws PortalException {

		return getService().getExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * Returns the explosive issuance of licence matching the UUID and group.
	 *
	 * @param uuid the explosive issuance of licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive issuance of licence
	 * @throws PortalException if a matching explosive issuance of licence could not be found
	 */
	public static ExplosiveIssuanceOfLicence
			getExplosiveIssuanceOfLicenceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getExplosiveIssuanceOfLicenceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of explosive issuance of licences
	 */
	public static List<ExplosiveIssuanceOfLicence>
		getExplosiveIssuanceOfLicences(int start, int end) {

		return getService().getExplosiveIssuanceOfLicences(start, end);
	}

	/**
	 * Returns all the explosive issuance of licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive issuance of licences
	 * @param companyId the primary key of the company
	 * @return the matching explosive issuance of licences, or an empty list if no matches were found
	 */
	public static List<ExplosiveIssuanceOfLicence>
		getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of explosive issuance of licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive issuance of licences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive issuance of licences, or an empty list if no matches were found
	 */
	public static List<ExplosiveIssuanceOfLicence>
		getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosiveIssuanceOfLicence> orderByComparator) {

		return getService().getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive issuance of licences.
	 *
	 * @return the number of explosive issuance of licences
	 */
	public static int getExplosiveIssuanceOfLicencesCount() {
		return getService().getExplosiveIssuanceOfLicencesCount();
	}

	public static ExplosiveIssuanceOfLicence getExplosiveLicIssBy_CI(
			String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getService().getExplosiveLicIssBy_CI(caseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the explosive issuance of licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 * @return the explosive issuance of licence that was updated
	 */
	public static ExplosiveIssuanceOfLicence updateExplosiveIssuanceOfLicence(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return getService().updateExplosiveIssuanceOfLicence(
			explosiveIssuanceOfLicence);
	}

	public static ExplosiveIssuanceOfLicence updateExplosiveIssuanceOfLicence(
			String caseId, java.util.Date dateOfIssue, java.util.Date dateOfExp,
			String certificateNum, long certificateId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveIssuanceOfLicenceException {

		return getService().updateExplosiveIssuanceOfLicence(
			caseId, dateOfIssue, dateOfExp, certificateNum, certificateId);
	}

	public static ExplosiveIssuanceOfLicenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosiveIssuanceOfLicenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosiveIssuanceOfLicenceLocalServiceUtil.class,
			ExplosiveIssuanceOfLicenceLocalService.class);

}