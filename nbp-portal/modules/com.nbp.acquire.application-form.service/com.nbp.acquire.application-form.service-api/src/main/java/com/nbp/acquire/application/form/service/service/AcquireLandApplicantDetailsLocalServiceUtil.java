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

import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetails;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireLandApplicantDetails. This utility wraps
 * <code>com.nbp.acquire.application.form.service.service.impl.AcquireLandApplicantDetailsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetailsLocalService
 * @generated
 */
public class AcquireLandApplicantDetailsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.application.form.service.service.impl.AcquireLandApplicantDetailsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire land applicant details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandApplicantDetails the acquire land applicant details
	 * @return the acquire land applicant details that was added
	 */
	public static AcquireLandApplicantDetails addAcquireLandApplicantDetails(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return getService().addAcquireLandApplicantDetails(
			acquireLandApplicantDetails);
	}

	/**
	 * Creates a new acquire land applicant details with the primary key. Does not add the acquire land applicant details to the database.
	 *
	 * @param acquireLandApplicantDetailsId the primary key for the new acquire land applicant details
	 * @return the new acquire land applicant details
	 */
	public static AcquireLandApplicantDetails createAcquireLandApplicantDetails(
		long acquireLandApplicantDetailsId) {

		return getService().createAcquireLandApplicantDetails(
			acquireLandApplicantDetailsId);
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
	 * Deletes the acquire land applicant details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandApplicantDetails the acquire land applicant details
	 * @return the acquire land applicant details that was removed
	 */
	public static AcquireLandApplicantDetails deleteAcquireLandApplicantDetails(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return getService().deleteAcquireLandApplicantDetails(
			acquireLandApplicantDetails);
	}

	/**
	 * Deletes the acquire land applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details that was removed
	 * @throws PortalException if a acquire land applicant details with the primary key could not be found
	 */
	public static AcquireLandApplicantDetails deleteAcquireLandApplicantDetails(
			long acquireLandApplicantDetailsId)
		throws PortalException {

		return getService().deleteAcquireLandApplicantDetails(
			acquireLandApplicantDetailsId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandApplicantDetailsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandApplicantDetailsModelImpl</code>.
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

	public static AcquireLandApplicantDetails fetchAcquireLandApplicantDetails(
		long acquireLandApplicantDetailsId) {

		return getService().fetchAcquireLandApplicantDetails(
			acquireLandApplicantDetailsId);
	}

	public static AcquireLandApplicantDetails getAcquireLandApplicantById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandApplicantDetailsException {

		return getService().getAcquireLandApplicantById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land applicant details with the primary key.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details
	 * @throws PortalException if a acquire land applicant details with the primary key could not be found
	 */
	public static AcquireLandApplicantDetails getAcquireLandApplicantDetails(
			long acquireLandApplicantDetailsId)
		throws PortalException {

		return getService().getAcquireLandApplicantDetails(
			acquireLandApplicantDetailsId);
	}

	/**
	 * Returns a range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @return the range of acquire land applicant detailses
	 */
	public static List<AcquireLandApplicantDetails>
		getAcquireLandApplicantDetailses(int start, int end) {

		return getService().getAcquireLandApplicantDetailses(start, end);
	}

	/**
	 * Returns the number of acquire land applicant detailses.
	 *
	 * @return the number of acquire land applicant detailses
	 */
	public static int getAcquireLandApplicantDetailsesCount() {
		return getService().getAcquireLandApplicantDetailsesCount();
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
	 * Updates the acquire land applicant details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandApplicantDetails the acquire land applicant details
	 * @return the acquire land applicant details that was updated
	 */
	public static AcquireLandApplicantDetails updateAcquireLandApplicantDetails(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return getService().updateAcquireLandApplicantDetails(
			acquireLandApplicantDetails);
	}

	public static AcquireLandApplicantDetailsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireLandApplicantDetailsLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireLandApplicantDetailsLocalServiceUtil.class,
			AcquireLandApplicantDetailsLocalService.class);

}