/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.collaboration.services.model.Collobartion;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Collobartion. This utility wraps
 * <code>com.nbp.collaboration.services.service.impl.CollobartionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CollobartionLocalService
 * @generated
 */
public class CollobartionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.collaboration.services.service.impl.CollobartionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the collobartion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collobartion the collobartion
	 * @return the collobartion that was added
	 */
	public static Collobartion addCollobartion(Collobartion collobartion) {
		return getService().addCollobartion(collobartion);
	}

	/**
	 * Creates a new collobartion with the primary key. Does not add the collobartion to the database.
	 *
	 * @param collaborationId the primary key for the new collobartion
	 * @return the new collobartion
	 */
	public static Collobartion createCollobartion(long collaborationId) {
		return getService().createCollobartion(collaborationId);
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
	 * Deletes the collobartion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collobartion the collobartion
	 * @return the collobartion that was removed
	 */
	public static Collobartion deleteCollobartion(Collobartion collobartion) {
		return getService().deleteCollobartion(collobartion);
	}

	/**
	 * Deletes the collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion that was removed
	 * @throws PortalException if a collobartion with the primary key could not be found
	 */
	public static Collobartion deleteCollobartion(long collaborationId)
		throws PortalException {

		return getService().deleteCollobartion(collaborationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.collaboration.services.model.impl.CollobartionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.collaboration.services.model.impl.CollobartionModelImpl</code>.
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

	public static Collobartion fetchCollobartion(long collaborationId) {
		return getService().fetchCollobartion(collaborationId);
	}

	/**
	 * Returns the collobartion matching the UUID and group.
	 *
	 * @param uuid the collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public static Collobartion fetchCollobartionByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchCollobartionByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Collobartion>
		getCollaborationStageCaseIdUserTypeArchived(
			String stageName, String caseId, String userType, int archived) {

		return getService().getCollaborationStageCaseIdUserTypeArchived(
			stageName, caseId, userType, archived);
	}

	/**
	 * Returns the collobartion with the primary key.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion
	 * @throws PortalException if a collobartion with the primary key could not be found
	 */
	public static Collobartion getCollobartion(long collaborationId)
		throws PortalException {

		return getService().getCollobartion(collaborationId);
	}

	public static List<Collobartion> getCollobartionByCaseId(String caseId) {
		return getService().getCollobartionByCaseId(caseId);
	}

	/**
	 * Returns the collobartion matching the UUID and group.
	 *
	 * @param uuid the collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching collobartion
	 * @throws PortalException if a matching collobartion could not be found
	 */
	public static Collobartion getCollobartionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getCollobartionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.collaboration.services.model.impl.CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of collobartions
	 */
	public static List<Collobartion> getCollobartions(int start, int end) {
		return getService().getCollobartions(start, end);
	}

	/**
	 * Returns all the collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the collobartions
	 * @param companyId the primary key of the company
	 * @return the matching collobartions, or an empty list if no matches were found
	 */
	public static List<Collobartion> getCollobartionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getCollobartionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the collobartions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching collobartions, or an empty list if no matches were found
	 */
	public static List<Collobartion> getCollobartionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Collobartion> orderByComparator) {

		return getService().getCollobartionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of collobartions.
	 *
	 * @return the number of collobartions
	 */
	public static int getCollobartionsCount() {
		return getService().getCollobartionsCount();
	}

	public static List<Collobartion> getCollobartionStageNameCaseId(
		String stageName, String caseId) {

		return getService().getCollobartionStageNameCaseId(stageName, caseId);
	}

	public static List<Collobartion> getCollobartionStageNameCaseIdUsertype(
		String stageName, String caseId, String userType) {

		return getService().getCollobartionStageNameCaseIdUsertype(
			stageName, caseId, userType);
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
	 * Updates the collobartion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param collobartion the collobartion
	 * @return the collobartion that was updated
	 */
	public static Collobartion updateCollobartion(Collobartion collobartion) {
		return getService().updateCollobartion(collobartion);
	}

	public static CollobartionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CollobartionLocalService> _serviceSnapshot =
		new Snapshot<>(
			CollobartionLocalServiceUtil.class, CollobartionLocalService.class);

}