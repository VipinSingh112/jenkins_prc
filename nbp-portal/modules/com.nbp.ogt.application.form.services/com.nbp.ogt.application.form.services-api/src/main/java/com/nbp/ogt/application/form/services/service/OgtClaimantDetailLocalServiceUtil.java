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

import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OgtClaimantDetail. This utility wraps
 * <code>com.nbp.ogt.application.form.services.service.impl.OgtClaimantDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetailLocalService
 * @generated
 */
public class OgtClaimantDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ogt.application.form.services.service.impl.OgtClaimantDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ogt claimant detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was added
	 */
	public static OgtClaimantDetail addOgtClaimantDetail(
		OgtClaimantDetail ogtClaimantDetail) {

		return getService().addOgtClaimantDetail(ogtClaimantDetail);
	}

	/**
	 * Creates a new ogt claimant detail with the primary key. Does not add the ogt claimant detail to the database.
	 *
	 * @param ogtClaimantDetailId the primary key for the new ogt claimant detail
	 * @return the new ogt claimant detail
	 */
	public static OgtClaimantDetail createOgtClaimantDetail(
		long ogtClaimantDetailId) {

		return getService().createOgtClaimantDetail(ogtClaimantDetailId);
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
	 * Deletes the ogt claimant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 * @throws PortalException if a ogt claimant detail with the primary key could not be found
	 */
	public static OgtClaimantDetail deleteOgtClaimantDetail(
			long ogtClaimantDetailId)
		throws PortalException {

		return getService().deleteOgtClaimantDetail(ogtClaimantDetailId);
	}

	/**
	 * Deletes the ogt claimant detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 */
	public static OgtClaimantDetail deleteOgtClaimantDetail(
		OgtClaimantDetail ogtClaimantDetail) {

		return getService().deleteOgtClaimantDetail(ogtClaimantDetail);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
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

	public static OgtClaimantDetail fetchOgtClaimantDetail(
		long ogtClaimantDetailId) {

		return getService().fetchOgtClaimantDetail(ogtClaimantDetailId);
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

	public static OgtClaimantDetail getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimantDetailException {

		return getService().getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claimant detail with the primary key.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail
	 * @throws PortalException if a ogt claimant detail with the primary key could not be found
	 */
	public static OgtClaimantDetail getOgtClaimantDetail(
			long ogtClaimantDetailId)
		throws PortalException {

		return getService().getOgtClaimantDetail(ogtClaimantDetailId);
	}

	/**
	 * Returns a range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @return the range of ogt claimant details
	 */
	public static List<OgtClaimantDetail> getOgtClaimantDetails(
		int start, int end) {

		return getService().getOgtClaimantDetails(start, end);
	}

	/**
	 * Returns the number of ogt claimant details.
	 *
	 * @return the number of ogt claimant details
	 */
	public static int getOgtClaimantDetailsCount() {
		return getService().getOgtClaimantDetailsCount();
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
	 * Updates the ogt claimant detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was updated
	 */
	public static OgtClaimantDetail updateOgtClaimantDetail(
		OgtClaimantDetail ogtClaimantDetail) {

		return getService().updateOgtClaimantDetail(ogtClaimantDetail);
	}

	public static OgtClaimantDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OgtClaimantDetailLocalService>
		_serviceSnapshot = new Snapshot<>(
			OgtClaimantDetailLocalServiceUtil.class,
			OgtClaimantDetailLocalService.class);

}