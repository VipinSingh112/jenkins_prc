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

import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCChecklistAdd. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAddLocalService
 * @generated
 */
public class JADSCChecklistAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc checklist add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 * @return the jadsc checklist add that was added
	 */
	public static JADSCChecklistAdd addJADSCChecklistAdd(
		JADSCChecklistAdd jadscChecklistAdd) {

		return getService().addJADSCChecklistAdd(jadscChecklistAdd);
	}

	/**
	 * Creates a new jadsc checklist add with the primary key. Does not add the jadsc checklist add to the database.
	 *
	 * @param jADSCChecklistAddId the primary key for the new jadsc checklist add
	 * @return the new jadsc checklist add
	 */
	public static JADSCChecklistAdd createJADSCChecklistAdd(
		long jADSCChecklistAddId) {

		return getService().createJADSCChecklistAdd(jADSCChecklistAddId);
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
	 * Deletes the jadsc checklist add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 */
	public static JADSCChecklistAdd deleteJADSCChecklistAdd(
		JADSCChecklistAdd jadscChecklistAdd) {

		return getService().deleteJADSCChecklistAdd(jadscChecklistAdd);
	}

	/**
	 * Deletes the jadsc checklist add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 * @throws PortalException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd deleteJADSCChecklistAdd(
			long jADSCChecklistAddId)
		throws PortalException {

		return getService().deleteJADSCChecklistAdd(jADSCChecklistAddId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl</code>.
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

	public static JADSCChecklistAdd fetchJADSCChecklistAdd(
		long jADSCChecklistAddId) {

		return getService().fetchJADSCChecklistAdd(jADSCChecklistAddId);
	}

	/**
	 * Returns the jadsc checklist add matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist add's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd fetchJADSCChecklistAddByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchJADSCChecklistAddByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<JADSCChecklistAdd> getAppIdJADSC(
		long jadscApplicationId) {

		return getService().getAppIdJADSC(jadscApplicationId);
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

	public static List<JADSCChecklistAdd> getJadsc_byAppId(
		long jadscApplicationId) {

		return getService().getJadsc_byAppId(jadscApplicationId);
	}

	public static JADSCChecklistAdd getJadscByAppId(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return getService().getJadscByAppId(jadscApplicationId);
	}

	/**
	 * Returns the jadsc checklist add with the primary key.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add
	 * @throws PortalException if a jadsc checklist add with the primary key could not be found
	 */
	public static JADSCChecklistAdd getJADSCChecklistAdd(
			long jADSCChecklistAddId)
		throws PortalException {

		return getService().getJADSCChecklistAdd(jADSCChecklistAddId);
	}

	/**
	 * Returns the jadsc checklist add matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist add's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist add
	 * @throws PortalException if a matching jadsc checklist add could not be found
	 */
	public static JADSCChecklistAdd getJADSCChecklistAddByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCChecklistAddByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of jadsc checklist adds
	 */
	public static List<JADSCChecklistAdd> getJADSCChecklistAdds(
		int start, int end) {

		return getService().getJADSCChecklistAdds(start, end);
	}

	/**
	 * Returns all the jadsc checklist adds matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklist adds
	 * @param companyId the primary key of the company
	 * @return the matching jadsc checklist adds, or an empty list if no matches were found
	 */
	public static List<JADSCChecklistAdd>
		getJADSCChecklistAddsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getJADSCChecklistAddsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc checklist adds matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklist adds
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc checklist adds, or an empty list if no matches were found
	 */
	public static List<JADSCChecklistAdd>
		getJADSCChecklistAddsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JADSCChecklistAdd> orderByComparator) {

		return getService().getJADSCChecklistAddsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc checklist adds.
	 *
	 * @return the number of jadsc checklist adds
	 */
	public static int getJADSCChecklistAddsCount() {
		return getService().getJADSCChecklistAddsCount();
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
	 * Updates the jadsc checklist add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 * @return the jadsc checklist add that was updated
	 */
	public static JADSCChecklistAdd updateJADSCChecklistAdd(
		JADSCChecklistAdd jadscChecklistAdd) {

		return getService().updateJADSCChecklistAdd(jadscChecklistAdd);
	}

	public static JADSCChecklistAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCChecklistAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			JADSCChecklistAddLocalServiceUtil.class,
			JADSCChecklistAddLocalService.class);

}