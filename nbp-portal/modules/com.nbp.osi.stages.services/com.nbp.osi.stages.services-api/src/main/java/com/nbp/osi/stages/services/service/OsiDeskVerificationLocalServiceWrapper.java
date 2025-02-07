/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiDeskVerificationLocalService
 * @generated
 */
public class OsiDeskVerificationLocalServiceWrapper
	implements OsiDeskVerificationLocalService,
			   ServiceWrapper<OsiDeskVerificationLocalService> {

	public OsiDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public OsiDeskVerificationLocalServiceWrapper(
		OsiDeskVerificationLocalService osiDeskVerificationLocalService) {

		_osiDeskVerificationLocalService = osiDeskVerificationLocalService;
	}

	/**
	 * Adds the osi desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiDeskVerification the osi desk verification
	 * @return the osi desk verification that was added
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
		addOsiDeskVerification(
			com.nbp.osi.stages.services.model.OsiDeskVerification
				osiDeskVerification) {

		return _osiDeskVerificationLocalService.addOsiDeskVerification(
			osiDeskVerification);
	}

	/**
	 * Creates a new osi desk verification with the primary key. Does not add the osi desk verification to the database.
	 *
	 * @param osiDeskVerificationId the primary key for the new osi desk verification
	 * @return the new osi desk verification
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
		createOsiDeskVerification(long osiDeskVerificationId) {

		return _osiDeskVerificationLocalService.createOsiDeskVerification(
			osiDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification that was removed
	 * @throws PortalException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
			deleteOsiDeskVerification(long osiDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiDeskVerificationLocalService.deleteOsiDeskVerification(
			osiDeskVerificationId);
	}

	/**
	 * Deletes the osi desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiDeskVerification the osi desk verification
	 * @return the osi desk verification that was removed
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
		deleteOsiDeskVerification(
			com.nbp.osi.stages.services.model.OsiDeskVerification
				osiDeskVerification) {

		return _osiDeskVerificationLocalService.deleteOsiDeskVerification(
			osiDeskVerification);
	}

	@Override
	public void deleteOsiDeskVerificationId(long osiApplicationId) {
		_osiDeskVerificationLocalService.deleteOsiDeskVerificationId(
			osiApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiDeskVerificationLocalService.dynamicQuery();
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

		return _osiDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiDeskVerificationModelImpl</code>.
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

		return _osiDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiDeskVerificationModelImpl</code>.
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

		return _osiDeskVerificationLocalService.dynamicQuery(
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

		return _osiDeskVerificationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
		fetchOsiDeskVerification(long osiDeskVerificationId) {

		return _osiDeskVerificationLocalService.fetchOsiDeskVerification(
			osiDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiDeskVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiDeskVerification>
		getDeskVerificationOsiById(long osiApplicationId) {

		return _osiDeskVerificationLocalService.getDeskVerificationOsiById(
			osiApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi desk verification with the primary key.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification
	 * @throws PortalException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
			getOsiDeskVerification(long osiDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiDeskVerificationLocalService.getOsiDeskVerification(
			osiDeskVerificationId);
	}

	/**
	 * Returns a range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of osi desk verifications
	 */
	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiDeskVerification>
		getOsiDeskVerifications(int start, int end) {

		return _osiDeskVerificationLocalService.getOsiDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of osi desk verifications.
	 *
	 * @return the number of osi desk verifications
	 */
	@Override
	public int getOsiDeskVerificationsCount() {
		return _osiDeskVerificationLocalService.getOsiDeskVerificationsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiDeskVerification the osi desk verification
	 * @return the osi desk verification that was updated
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiDeskVerification
		updateOsiDeskVerification(
			com.nbp.osi.stages.services.model.OsiDeskVerification
				osiDeskVerification) {

		return _osiDeskVerificationLocalService.updateOsiDeskVerification(
			osiDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public OsiDeskVerificationLocalService getWrappedService() {
		return _osiDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiDeskVerificationLocalService osiDeskVerificationLocalService) {

		_osiDeskVerificationLocalService = osiDeskVerificationLocalService;
	}

	private OsiDeskVerificationLocalService _osiDeskVerificationLocalService;

}