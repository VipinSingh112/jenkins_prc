/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDeskVerificationLocalService
 * @generated
 */
public class CreativeDeskVerificationLocalServiceWrapper
	implements CreativeDeskVerificationLocalService,
			   ServiceWrapper<CreativeDeskVerificationLocalService> {

	public CreativeDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public CreativeDeskVerificationLocalServiceWrapper(
		CreativeDeskVerificationLocalService
			creativeDeskVerificationLocalService) {

		_creativeDeskVerificationLocalService =
			creativeDeskVerificationLocalService;
	}

	/**
	 * Adds the creative desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDeskVerification the creative desk verification
	 * @return the creative desk verification that was added
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
		addCreativeDeskVerification(
			com.nbp.creative.stages.services.model.CreativeDeskVerification
				creativeDeskVerification) {

		return _creativeDeskVerificationLocalService.
			addCreativeDeskVerification(creativeDeskVerification);
	}

	/**
	 * Creates a new creative desk verification with the primary key. Does not add the creative desk verification to the database.
	 *
	 * @param creativeDeskVerificationId the primary key for the new creative desk verification
	 * @return the new creative desk verification
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
		createCreativeDeskVerification(long creativeDeskVerificationId) {

		return _creativeDeskVerificationLocalService.
			createCreativeDeskVerification(creativeDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDeskVerification the creative desk verification
	 * @return the creative desk verification that was removed
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
		deleteCreativeDeskVerification(
			com.nbp.creative.stages.services.model.CreativeDeskVerification
				creativeDeskVerification) {

		return _creativeDeskVerificationLocalService.
			deleteCreativeDeskVerification(creativeDeskVerification);
	}

	/**
	 * Deletes the creative desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification that was removed
	 * @throws PortalException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
			deleteCreativeDeskVerification(long creativeDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDeskVerificationLocalService.
			deleteCreativeDeskVerification(creativeDeskVerificationId);
	}

	@Override
	public void deleteCreativeDV_ById(long creativeApplicationId) {
		_creativeDeskVerificationLocalService.deleteCreativeDV_ById(
			creativeApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeDeskVerificationLocalService.dynamicQuery();
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

		return _creativeDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationModelImpl</code>.
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

		return _creativeDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationModelImpl</code>.
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

		return _creativeDeskVerificationLocalService.dynamicQuery(
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

		return _creativeDeskVerificationLocalService.dynamicQueryCount(
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

		return _creativeDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
		fetchCreativeDeskVerification(long creativeDeskVerificationId) {

		return _creativeDeskVerificationLocalService.
			fetchCreativeDeskVerification(creativeDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeDeskVerificationLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the creative desk verification with the primary key.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification
	 * @throws PortalException if a creative desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
			getCreativeDeskVerification(long creativeDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDeskVerificationLocalService.
			getCreativeDeskVerification(creativeDeskVerificationId);
	}

	/**
	 * Returns a range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of creative desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeDeskVerification>
			getCreativeDeskVerifications(int start, int end) {

		return _creativeDeskVerificationLocalService.
			getCreativeDeskVerifications(start, end);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeDeskVerification>
			getCreativeDeskVerifications(long creativeApplicationId) {

		return _creativeDeskVerificationLocalService.
			getCreativeDeskVerifications(creativeApplicationId);
	}

	/**
	 * Returns the number of creative desk verifications.
	 *
	 * @return the number of creative desk verifications
	 */
	@Override
	public int getCreativeDeskVerificationsCount() {
		return _creativeDeskVerificationLocalService.
			getCreativeDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDeskVerification the creative desk verification
	 * @return the creative desk verification that was updated
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeDeskVerification
		updateCreativeDeskVerification(
			com.nbp.creative.stages.services.model.CreativeDeskVerification
				creativeDeskVerification) {

		return _creativeDeskVerificationLocalService.
			updateCreativeDeskVerification(creativeDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public CreativeDeskVerificationLocalService getWrappedService() {
		return _creativeDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeDeskVerificationLocalService
			creativeDeskVerificationLocalService) {

		_creativeDeskVerificationLocalService =
			creativeDeskVerificationLocalService;
	}

	private CreativeDeskVerificationLocalService
		_creativeDeskVerificationLocalService;

}