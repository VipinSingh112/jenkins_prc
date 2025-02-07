/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireLandApplicantDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetailsLocalService
 * @generated
 */
public class AcquireLandApplicantDetailsLocalServiceWrapper
	implements AcquireLandApplicantDetailsLocalService,
			   ServiceWrapper<AcquireLandApplicantDetailsLocalService> {

	public AcquireLandApplicantDetailsLocalServiceWrapper() {
		this(null);
	}

	public AcquireLandApplicantDetailsLocalServiceWrapper(
		AcquireLandApplicantDetailsLocalService
			acquireLandApplicantDetailsLocalService) {

		_acquireLandApplicantDetailsLocalService =
			acquireLandApplicantDetailsLocalService;
	}

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
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails addAcquireLandApplicantDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return _acquireLandApplicantDetailsLocalService.
			addAcquireLandApplicantDetails(acquireLandApplicantDetails);
	}

	/**
	 * Creates a new acquire land applicant details with the primary key. Does not add the acquire land applicant details to the database.
	 *
	 * @param acquireLandApplicantDetailsId the primary key for the new acquire land applicant details
	 * @return the new acquire land applicant details
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails createAcquireLandApplicantDetails(
				long acquireLandApplicantDetailsId) {

		return _acquireLandApplicantDetailsLocalService.
			createAcquireLandApplicantDetails(acquireLandApplicantDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandApplicantDetailsLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails deleteAcquireLandApplicantDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return _acquireLandApplicantDetailsLocalService.
			deleteAcquireLandApplicantDetails(acquireLandApplicantDetails);
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
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails deleteAcquireLandApplicantDetails(
					long acquireLandApplicantDetailsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandApplicantDetailsLocalService.
			deleteAcquireLandApplicantDetails(acquireLandApplicantDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandApplicantDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireLandApplicantDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireLandApplicantDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireLandApplicantDetailsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _acquireLandApplicantDetailsLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _acquireLandApplicantDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _acquireLandApplicantDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _acquireLandApplicantDetailsLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _acquireLandApplicantDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails fetchAcquireLandApplicantDetails(
				long acquireLandApplicantDetailsId) {

		return _acquireLandApplicantDetailsLocalService.
			fetchAcquireLandApplicantDetails(acquireLandApplicantDetailsId);
	}

	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails getAcquireLandApplicantById(
					long acquireApplicationId)
				throws com.nbp.acquire.application.form.service.exception.
					NoSuchAcquireLandApplicantDetailsException {

		return _acquireLandApplicantDetailsLocalService.
			getAcquireLandApplicantById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land applicant details with the primary key.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details
	 * @throws PortalException if a acquire land applicant details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails getAcquireLandApplicantDetails(
					long acquireLandApplicantDetailsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandApplicantDetailsLocalService.
			getAcquireLandApplicantDetails(acquireLandApplicantDetailsId);
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
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails> getAcquireLandApplicantDetailses(
				int start, int end) {

		return _acquireLandApplicantDetailsLocalService.
			getAcquireLandApplicantDetailses(start, end);
	}

	/**
	 * Returns the number of acquire land applicant detailses.
	 *
	 * @return the number of acquire land applicant detailses
	 */
	@Override
	public int getAcquireLandApplicantDetailsesCount() {
		return _acquireLandApplicantDetailsLocalService.
			getAcquireLandApplicantDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireLandApplicantDetailsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireLandApplicantDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireLandApplicantDetailsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandApplicantDetailsLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public
		com.nbp.acquire.application.form.service.model.
			AcquireLandApplicantDetails updateAcquireLandApplicantDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return _acquireLandApplicantDetailsLocalService.
			updateAcquireLandApplicantDetails(acquireLandApplicantDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireLandApplicantDetailsLocalService.getBasePersistence();
	}

	@Override
	public AcquireLandApplicantDetailsLocalService getWrappedService() {
		return _acquireLandApplicantDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireLandApplicantDetailsLocalService
			acquireLandApplicantDetailsLocalService) {

		_acquireLandApplicantDetailsLocalService =
			acquireLandApplicantDetailsLocalService;
	}

	private AcquireLandApplicantDetailsLocalService
		_acquireLandApplicantDetailsLocalService;

}