/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OgtInsolventPersonDetail. This utility wraps
 * <code>com.nbp.ogt.application.form.services.service.impl.OgtInsolventPersonDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetailLocalService
 * @generated
 */
public class OgtInsolventPersonDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ogt.application.form.services.service.impl.OgtInsolventPersonDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ogt insolvent person detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was added
	 */
	public static OgtInsolventPersonDetail addOgtInsolventPersonDetail(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		return getService().addOgtInsolventPersonDetail(
			ogtInsolventPersonDetail);
	}

	/**
	 * Creates a new ogt insolvent person detail with the primary key. Does not add the ogt insolvent person detail to the database.
	 *
	 * @param ogtInsolventPersonDetailId the primary key for the new ogt insolvent person detail
	 * @return the new ogt insolvent person detail
	 */
	public static OgtInsolventPersonDetail createOgtInsolventPersonDetail(
		long ogtInsolventPersonDetailId) {

		return getService().createOgtInsolventPersonDetail(
			ogtInsolventPersonDetailId);
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
	 * Deletes the ogt insolvent person detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 * @throws PortalException if a ogt insolvent person detail with the primary key could not be found
	 */
	public static OgtInsolventPersonDetail deleteOgtInsolventPersonDetail(
			long ogtInsolventPersonDetailId)
		throws PortalException {

		return getService().deleteOgtInsolventPersonDetail(
			ogtInsolventPersonDetailId);
	}

	/**
	 * Deletes the ogt insolvent person detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 */
	public static OgtInsolventPersonDetail deleteOgtInsolventPersonDetail(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		return getService().deleteOgtInsolventPersonDetail(
			ogtInsolventPersonDetail);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl</code>.
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

	public static OgtInsolventPersonDetail fetchOgtInsolventPersonDetail(
		long ogtInsolventPersonDetailId) {

		return getService().fetchOgtInsolventPersonDetail(
			ogtInsolventPersonDetailId);
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

	public static OgtInsolventPersonDetail getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtInsolventPersonDetailException {

		return getService().getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail
	 * @throws PortalException if a ogt insolvent person detail with the primary key could not be found
	 */
	public static OgtInsolventPersonDetail getOgtInsolventPersonDetail(
			long ogtInsolventPersonDetailId)
		throws PortalException {

		return getService().getOgtInsolventPersonDetail(
			ogtInsolventPersonDetailId);
	}

	/**
	 * Returns a range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @return the range of ogt insolvent person details
	 */
	public static List<OgtInsolventPersonDetail> getOgtInsolventPersonDetails(
		int start, int end) {

		return getService().getOgtInsolventPersonDetails(start, end);
	}

	/**
	 * Returns the number of ogt insolvent person details.
	 *
	 * @return the number of ogt insolvent person details
	 */
	public static int getOgtInsolventPersonDetailsCount() {
		return getService().getOgtInsolventPersonDetailsCount();
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
	 * Updates the ogt insolvent person detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was updated
	 */
	public static OgtInsolventPersonDetail updateOgtInsolventPersonDetail(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		return getService().updateOgtInsolventPersonDetail(
			ogtInsolventPersonDetail);
	}

	public static OgtInsolventPersonDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OgtInsolventPersonDetailLocalService>
		_serviceSnapshot = new Snapshot<>(
			OgtInsolventPersonDetailLocalServiceUtil.class,
			OgtInsolventPersonDetailLocalService.class);

}