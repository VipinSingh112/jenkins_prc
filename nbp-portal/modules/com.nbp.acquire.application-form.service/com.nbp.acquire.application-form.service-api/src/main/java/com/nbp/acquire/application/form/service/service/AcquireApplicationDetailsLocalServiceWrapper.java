/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireApplicationDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetailsLocalService
 * @generated
 */
public class AcquireApplicationDetailsLocalServiceWrapper
	implements AcquireApplicationDetailsLocalService,
			   ServiceWrapper<AcquireApplicationDetailsLocalService> {

	public AcquireApplicationDetailsLocalServiceWrapper() {
		this(null);
	}

	public AcquireApplicationDetailsLocalServiceWrapper(
		AcquireApplicationDetailsLocalService
			acquireApplicationDetailsLocalService) {

		_acquireApplicationDetailsLocalService =
			acquireApplicationDetailsLocalService;
	}

	/**
	 * Adds the acquire application details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationDetails the acquire application details
	 * @return the acquire application details that was added
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
			addAcquireApplicationDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireApplicationDetails acquireApplicationDetails) {

		return _acquireApplicationDetailsLocalService.
			addAcquireApplicationDetails(acquireApplicationDetails);
	}

	/**
	 * Creates a new acquire application details with the primary key. Does not add the acquire application details to the database.
	 *
	 * @param acquireApplicationDetailsId the primary key for the new acquire application details
	 * @return the new acquire application details
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
			createAcquireApplicationDetails(long acquireApplicationDetailsId) {

		return _acquireApplicationDetailsLocalService.
			createAcquireApplicationDetails(acquireApplicationDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire application details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationDetails the acquire application details
	 * @return the acquire application details that was removed
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
			deleteAcquireApplicationDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireApplicationDetails acquireApplicationDetails) {

		return _acquireApplicationDetailsLocalService.
			deleteAcquireApplicationDetails(acquireApplicationDetails);
	}

	/**
	 * Deletes the acquire application details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details that was removed
	 * @throws PortalException if a acquire application details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
				deleteAcquireApplicationDetails(
					long acquireApplicationDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationDetailsLocalService.
			deleteAcquireApplicationDetails(acquireApplicationDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireApplicationDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireApplicationDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireApplicationDetailsLocalService.dynamicQuery();
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

		return _acquireApplicationDetailsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsModelImpl</code>.
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

		return _acquireApplicationDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsModelImpl</code>.
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

		return _acquireApplicationDetailsLocalService.dynamicQuery(
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

		return _acquireApplicationDetailsLocalService.dynamicQueryCount(
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

		return _acquireApplicationDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
			fetchAcquireApplicationDetails(long acquireApplicationDetailsId) {

		return _acquireApplicationDetailsLocalService.
			fetchAcquireApplicationDetails(acquireApplicationDetailsId);
	}

	/**
	 * Returns the acquire application details with the primary key.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details
	 * @throws PortalException if a acquire application details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
				getAcquireApplicationDetails(long acquireApplicationDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationDetailsLocalService.
			getAcquireApplicationDetails(acquireApplicationDetailsId);
	}

	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
				getAcquireApplicationDetailsById(long acquireApplicationId)
			throws com.nbp.acquire.application.form.service.exception.
				NoSuchAcquireApplicationDetailsException {

		return _acquireApplicationDetailsLocalService.
			getAcquireApplicationDetailsById(acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @return the range of acquire application detailses
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.
			AcquireApplicationDetails> getAcquireApplicationDetailses(
				int start, int end) {

		return _acquireApplicationDetailsLocalService.
			getAcquireApplicationDetailses(start, end);
	}

	/**
	 * Returns the number of acquire application detailses.
	 *
	 * @return the number of acquire application detailses
	 */
	@Override
	public int getAcquireApplicationDetailsesCount() {
		return _acquireApplicationDetailsLocalService.
			getAcquireApplicationDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireApplicationDetailsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireApplicationDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireApplicationDetailsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire application details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationDetails the acquire application details
	 * @return the acquire application details that was updated
	 */
	@Override
	public
		com.nbp.acquire.application.form.service.model.AcquireApplicationDetails
			updateAcquireApplicationDetails(
				com.nbp.acquire.application.form.service.model.
					AcquireApplicationDetails acquireApplicationDetails) {

		return _acquireApplicationDetailsLocalService.
			updateAcquireApplicationDetails(acquireApplicationDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireApplicationDetailsLocalService.getBasePersistence();
	}

	@Override
	public AcquireApplicationDetailsLocalService getWrappedService() {
		return _acquireApplicationDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireApplicationDetailsLocalService
			acquireApplicationDetailsLocalService) {

		_acquireApplicationDetailsLocalService =
			acquireApplicationDetailsLocalService;
	}

	private AcquireApplicationDetailsLocalService
		_acquireApplicationDetailsLocalService;

}