/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjSectionDetailAdd. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjSectionDetailAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddLocalService
 * @generated
 */
public class NcbjSectionDetailAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjSectionDetailAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj section detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 * @return the ncbj section detail add that was added
	 */
	public static NcbjSectionDetailAdd addNcbjSectionDetailAdd(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		return getService().addNcbjSectionDetailAdd(ncbjSectionDetailAdd);
	}

	/**
	 * Creates a new ncbj section detail add with the primary key. Does not add the ncbj section detail add to the database.
	 *
	 * @param ncbjSectionDetailAddId the primary key for the new ncbj section detail add
	 * @return the new ncbj section detail add
	 */
	public static NcbjSectionDetailAdd createNcbjSectionDetailAdd(
		long ncbjSectionDetailAddId) {

		return getService().createNcbjSectionDetailAdd(ncbjSectionDetailAddId);
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
	 * Deletes the ncbj section detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 * @throws PortalException if a ncbj section detail add with the primary key could not be found
	 */
	public static NcbjSectionDetailAdd deleteNcbjSectionDetailAdd(
			long ncbjSectionDetailAddId)
		throws PortalException {

		return getService().deleteNcbjSectionDetailAdd(ncbjSectionDetailAddId);
	}

	/**
	 * Deletes the ncbj section detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 */
	public static NcbjSectionDetailAdd deleteNcbjSectionDetailAdd(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		return getService().deleteNcbjSectionDetailAdd(ncbjSectionDetailAdd);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code>.
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

	public static NcbjSectionDetailAdd fetchNcbjSectionDetailAdd(
		long ncbjSectionDetailAddId) {

		return getService().fetchNcbjSectionDetailAdd(ncbjSectionDetailAddId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<NcbjSectionDetailAdd> getNCBJById(
		long ncbjApplicationId) {

		return getService().getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section detail add with the primary key.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add
	 * @throws PortalException if a ncbj section detail add with the primary key could not be found
	 */
	public static NcbjSectionDetailAdd getNcbjSectionDetailAdd(
			long ncbjSectionDetailAddId)
		throws PortalException {

		return getService().getNcbjSectionDetailAdd(ncbjSectionDetailAddId);
	}

	/**
	 * Returns a range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> getNcbjSectionDetailAdds(
		int start, int end) {

		return getService().getNcbjSectionDetailAdds(start, end);
	}

	/**
	 * Returns the number of ncbj section detail adds.
	 *
	 * @return the number of ncbj section detail adds
	 */
	public static int getNcbjSectionDetailAddsCount() {
		return getService().getNcbjSectionDetailAddsCount();
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
	 * Updates the ncbj section detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 * @return the ncbj section detail add that was updated
	 */
	public static NcbjSectionDetailAdd updateNcbjSectionDetailAdd(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		return getService().updateNcbjSectionDetailAdd(ncbjSectionDetailAdd);
	}

	public static NcbjSectionDetailAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjSectionDetailAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjSectionDetailAddLocalServiceUtil.class,
			NcbjSectionDetailAddLocalService.class);

}