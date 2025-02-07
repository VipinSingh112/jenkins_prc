/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireDocumentList;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireDocumentList. This utility wraps
 * <code>com.nbp.acquire.application.form.service.service.impl.AcquireDocumentListLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentListLocalService
 * @generated
 */
public class AcquireDocumentListLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.application.form.service.service.impl.AcquireDocumentListLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire document list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentList the acquire document list
	 * @return the acquire document list that was added
	 */
	public static AcquireDocumentList addAcquireDocumentList(
		AcquireDocumentList acquireDocumentList) {

		return getService().addAcquireDocumentList(acquireDocumentList);
	}

	/**
	 * Creates a new acquire document list with the primary key. Does not add the acquire document list to the database.
	 *
	 * @param acquireDocumentListId the primary key for the new acquire document list
	 * @return the new acquire document list
	 */
	public static AcquireDocumentList createAcquireDocumentList(
		long acquireDocumentListId) {

		return getService().createAcquireDocumentList(acquireDocumentListId);
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
	 * Deletes the acquire document list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentList the acquire document list
	 * @return the acquire document list that was removed
	 */
	public static AcquireDocumentList deleteAcquireDocumentList(
		AcquireDocumentList acquireDocumentList) {

		return getService().deleteAcquireDocumentList(acquireDocumentList);
	}

	/**
	 * Deletes the acquire document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list that was removed
	 * @throws PortalException if a acquire document list with the primary key could not be found
	 */
	public static AcquireDocumentList deleteAcquireDocumentList(
			long acquireDocumentListId)
		throws PortalException {

		return getService().deleteAcquireDocumentList(acquireDocumentListId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl</code>.
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

	public static AcquireDocumentList fetchAcquireDocumentList(
		long acquireDocumentListId) {

		return getService().fetchAcquireDocumentList(acquireDocumentListId);
	}

	public static List<AcquireDocumentList> getAcquireDocumentByDocType(
		String documentType) {

		return getService().getAcquireDocumentByDocType(documentType);
	}

	/**
	 * Returns the acquire document list with the primary key.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list
	 * @throws PortalException if a acquire document list with the primary key could not be found
	 */
	public static AcquireDocumentList getAcquireDocumentList(
			long acquireDocumentListId)
		throws PortalException {

		return getService().getAcquireDocumentList(acquireDocumentListId);
	}

	/**
	 * Returns a range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @return the range of acquire document lists
	 */
	public static List<AcquireDocumentList> getAcquireDocumentLists(
		int start, int end) {

		return getService().getAcquireDocumentLists(start, end);
	}

	/**
	 * Returns the number of acquire document lists.
	 *
	 * @return the number of acquire document lists
	 */
	public static int getAcquireDocumentListsCount() {
		return getService().getAcquireDocumentListsCount();
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
	 * Updates the acquire document list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentList the acquire document list
	 * @return the acquire document list that was updated
	 */
	public static AcquireDocumentList updateAcquireDocumentList(
		AcquireDocumentList acquireDocumentList) {

		return getService().updateAcquireDocumentList(acquireDocumentList);
	}

	public static AcquireDocumentListLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireDocumentListLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireDocumentListLocalServiceUtil.class,
			AcquireDocumentListLocalService.class);

}