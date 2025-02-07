/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCChecklist;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCChecklist. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistLocalService
 * @generated
 */
public class JADSCChecklistLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc checklist to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was added
	 */
	public static JADSCChecklist addJADSCChecklist(
		JADSCChecklist jadscChecklist) {

		return getService().addJADSCChecklist(jadscChecklist);
	}

	/**
	 * Creates a new jadsc checklist with the primary key. Does not add the jadsc checklist to the database.
	 *
	 * @param jadscChecklistId the primary key for the new jadsc checklist
	 * @return the new jadsc checklist
	 */
	public static JADSCChecklist createJADSCChecklist(long jadscChecklistId) {
		return getService().createJADSCChecklist(jadscChecklistId);
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
	 * Deletes the jadsc checklist from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was removed
	 */
	public static JADSCChecklist deleteJADSCChecklist(
		JADSCChecklist jadscChecklist) {

		return getService().deleteJADSCChecklist(jadscChecklist);
	}

	/**
	 * Deletes the jadsc checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist that was removed
	 * @throws PortalException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist deleteJADSCChecklist(long jadscChecklistId)
		throws PortalException {

		return getService().deleteJADSCChecklist(jadscChecklistId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
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

	public static JADSCChecklist fetchJADSCChecklist(long jadscChecklistId) {
		return getService().fetchJADSCChecklist(jadscChecklistId);
	}

	/**
	 * Returns the jadsc checklist matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist fetchJADSCChecklistByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchJADSCChecklistByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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

	public static List<JADSCChecklist> getJADSC_ByAppId(
		long jadscApplicationId) {

		return getService().getJADSC_ByAppId(jadscApplicationId);
	}

	/**
	 * Returns the jadsc checklist with the primary key.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist
	 * @throws PortalException if a jadsc checklist with the primary key could not be found
	 */
	public static JADSCChecklist getJADSCChecklist(long jadscChecklistId)
		throws PortalException {

		return getService().getJADSCChecklist(jadscChecklistId);
	}

	/**
	 * Returns the jadsc checklist matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist
	 * @throws PortalException if a matching jadsc checklist could not be found
	 */
	public static JADSCChecklist getJADSCChecklistByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCChecklistByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of jadsc checklists
	 */
	public static List<JADSCChecklist> getJADSCChecklists(int start, int end) {
		return getService().getJADSCChecklists(start, end);
	}

	/**
	 * Returns all the jadsc checklists matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklists
	 * @param companyId the primary key of the company
	 * @return the matching jadsc checklists, or an empty list if no matches were found
	 */
	public static List<JADSCChecklist> getJADSCChecklistsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getJADSCChecklistsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc checklists matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklists
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc checklists, or an empty list if no matches were found
	 */
	public static List<JADSCChecklist> getJADSCChecklistsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator) {

		return getService().getJADSCChecklistsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc checklists.
	 *
	 * @return the number of jadsc checklists
	 */
	public static int getJADSCChecklistsCount() {
		return getService().getJADSCChecklistsCount();
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
	 * Updates the jadsc checklist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was updated
	 */
	public static JADSCChecklist updateJADSCChecklist(
		JADSCChecklist jadscChecklist) {

		return getService().updateJADSCChecklist(jadscChecklist);
	}

	public static JADSCChecklistLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCChecklistLocalService> _serviceSnapshot =
		new Snapshot<>(
			JADSCChecklistLocalServiceUtil.class,
			JADSCChecklistLocalService.class);

}