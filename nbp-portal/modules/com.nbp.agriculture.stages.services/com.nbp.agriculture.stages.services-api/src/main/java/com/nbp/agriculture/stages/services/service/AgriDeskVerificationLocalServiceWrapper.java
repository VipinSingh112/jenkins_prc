/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgriDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriDeskVerificationLocalService
 * @generated
 */
public class AgriDeskVerificationLocalServiceWrapper
	implements AgriDeskVerificationLocalService,
			   ServiceWrapper<AgriDeskVerificationLocalService> {

	public AgriDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public AgriDeskVerificationLocalServiceWrapper(
		AgriDeskVerificationLocalService agriDeskVerificationLocalService) {

		_agriDeskVerificationLocalService = agriDeskVerificationLocalService;
	}

	/**
	 * Adds the agri desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriDeskVerification the agri desk verification
	 * @return the agri desk verification that was added
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
		addAgriDeskVerification(
			com.nbp.agriculture.stages.services.model.AgriDeskVerification
				agriDeskVerification) {

		return _agriDeskVerificationLocalService.addAgriDeskVerification(
			agriDeskVerification);
	}

	/**
	 * Creates a new agri desk verification with the primary key. Does not add the agri desk verification to the database.
	 *
	 * @param agriDeskVerificationId the primary key for the new agri desk verification
	 * @return the new agri desk verification
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
		createAgriDeskVerification(long agriDeskVerificationId) {

		return _agriDeskVerificationLocalService.createAgriDeskVerification(
			agriDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteAgricultureDV_ById(long agricultureApplicationId) {
		_agriDeskVerificationLocalService.deleteAgricultureDV_ById(
			agricultureApplicationId);
	}

	/**
	 * Deletes the agri desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriDeskVerification the agri desk verification
	 * @return the agri desk verification that was removed
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
		deleteAgriDeskVerification(
			com.nbp.agriculture.stages.services.model.AgriDeskVerification
				agriDeskVerification) {

		return _agriDeskVerificationLocalService.deleteAgriDeskVerification(
			agriDeskVerification);
	}

	/**
	 * Deletes the agri desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification that was removed
	 * @throws PortalException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
			deleteAgriDeskVerification(long agriDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriDeskVerificationLocalService.deleteAgriDeskVerification(
			agriDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agriDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agriDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agriDeskVerificationLocalService.dynamicQuery();
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

		return _agriDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationModelImpl</code>.
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

		return _agriDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationModelImpl</code>.
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

		return _agriDeskVerificationLocalService.dynamicQuery(
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

		return _agriDeskVerificationLocalService.dynamicQueryCount(
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

		return _agriDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
		fetchAgriDeskVerification(long agriDeskVerificationId) {

		return _agriDeskVerificationLocalService.fetchAgriDeskVerification(
			agriDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agriDeskVerificationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the agri desk verification with the primary key.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification
	 * @throws PortalException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
			getAgriDeskVerification(long agriDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriDeskVerificationLocalService.getAgriDeskVerification(
			agriDeskVerificationId);
	}

	/**
	 * Returns a range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of agri desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgriDeskVerification>
			getAgriDeskVerifications(int start, int end) {

		return _agriDeskVerificationLocalService.getAgriDeskVerifications(
			start, end);
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgriDeskVerification>
			getAgriDeskVerifications(long agricultureApplicationId) {

		return _agriDeskVerificationLocalService.getAgriDeskVerifications(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agri desk verifications.
	 *
	 * @return the number of agri desk verifications
	 */
	@Override
	public int getAgriDeskVerificationsCount() {
		return _agriDeskVerificationLocalService.
			getAgriDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agriDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agri desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriDeskVerification the agri desk verification
	 * @return the agri desk verification that was updated
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgriDeskVerification
		updateAgriDeskVerification(
			com.nbp.agriculture.stages.services.model.AgriDeskVerification
				agriDeskVerification) {

		return _agriDeskVerificationLocalService.updateAgriDeskVerification(
			agriDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agriDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public AgriDeskVerificationLocalService getWrappedService() {
		return _agriDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		AgriDeskVerificationLocalService agriDeskVerificationLocalService) {

		_agriDeskVerificationLocalService = agriDeskVerificationLocalService;
	}

	private AgriDeskVerificationLocalService _agriDeskVerificationLocalService;

}