/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisCollobartion. This utility wraps
 * <code>com.nbp.cannabis.collaboration.services.service.impl.CannabisCollobartionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionLocalService
 * @generated
 */
public class CannabisCollobartionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.collaboration.services.service.impl.CannabisCollobartionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis collobartion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was added
	 */
	public static CannabisCollobartion addCannabisCollobartion(
		CannabisCollobartion cannabisCollobartion) {

		return getService().addCannabisCollobartion(cannabisCollobartion);
	}

	/**
	 * Creates a new cannabis collobartion with the primary key. Does not add the cannabis collobartion to the database.
	 *
	 * @param cannabisCollaborationId the primary key for the new cannabis collobartion
	 * @return the new cannabis collobartion
	 */
	public static CannabisCollobartion createCannabisCollobartion(
		long cannabisCollaborationId) {

		return getService().createCannabisCollobartion(cannabisCollaborationId);
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
	 * Deletes the cannabis collobartion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 */
	public static CannabisCollobartion deleteCannabisCollobartion(
		CannabisCollobartion cannabisCollobartion) {

		return getService().deleteCannabisCollobartion(cannabisCollobartion);
	}

	/**
	 * Deletes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws PortalException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion deleteCannabisCollobartion(
			long cannabisCollaborationId)
		throws PortalException {

		return getService().deleteCannabisCollobartion(cannabisCollaborationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
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

	public static CannabisCollobartion fetchCannabisCollobartion(
		long cannabisCollaborationId) {

		return getService().fetchCannabisCollobartion(cannabisCollaborationId);
	}

	/**
	 * Returns the cannabis collobartion matching the UUID and group.
	 *
	 * @param uuid the cannabis collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion
		fetchCannabisCollobartionByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchCannabisCollobartionByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis collobartion with the primary key.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws PortalException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion getCannabisCollobartion(
			long cannabisCollaborationId)
		throws PortalException {

		return getService().getCannabisCollobartion(cannabisCollaborationId);
	}

	/**
	 * Returns the cannabis collobartion matching the UUID and group.
	 *
	 * @param uuid the cannabis collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis collobartion
	 * @throws PortalException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion getCannabisCollobartionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getCannabisCollobartionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of cannabis collobartions
	 */
	public static List<CannabisCollobartion> getCannabisCollobartions(
		int start, int end) {

		return getService().getCannabisCollobartions(start, end);
	}

	/**
	 * Returns all the cannabis collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis collobartions
	 * @param companyId the primary key of the company
	 * @return the matching cannabis collobartions, or an empty list if no matches were found
	 */
	public static List<CannabisCollobartion>
		getCannabisCollobartionsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getCannabisCollobartionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of cannabis collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis collobartions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis collobartions, or an empty list if no matches were found
	 */
	public static List<CannabisCollobartion>
		getCannabisCollobartionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getService().getCannabisCollobartionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis collobartions.
	 *
	 * @return the number of cannabis collobartions
	 */
	public static int getCannabisCollobartionsCount() {
		return getService().getCannabisCollobartionsCount();
	}

	public static List<CannabisCollobartion>
		getCollaborationStageCaseIdUserTypeArchived(
			String cannabisStage, String caseId, String userType,
			int archived) {

		return getService().getCollaborationStageCaseIdUserTypeArchived(
			cannabisStage, caseId, userType, archived);
	}

	public static List<CannabisCollobartion> getCollobartionByCaseId(
		String caseId) {

		return getService().getCollobartionByCaseId(caseId);
	}

	public static List<CannabisCollobartion> getCollobartionCannabisStageCaseId(
		String cannabisStage, String caseId) {

		return getService().getCollobartionCannabisStageCaseId(
			cannabisStage, caseId);
	}

	public static List<CannabisCollobartion>
		getCollobartionCannabisStageCaseIdUsertype(
			String cannabisStage, String caseId, String userType) {

		return getService().getCollobartionCannabisStageCaseIdUsertype(
			cannabisStage, caseId, userType);
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
	 * Updates the cannabis collobartion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was updated
	 */
	public static CannabisCollobartion updateCannabisCollobartion(
		CannabisCollobartion cannabisCollobartion) {

		return getService().updateCannabisCollobartion(cannabisCollobartion);
	}

	public static CannabisCollobartionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisCollobartionLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisCollobartionLocalServiceUtil.class,
			CannabisCollobartionLocalService.class);

}