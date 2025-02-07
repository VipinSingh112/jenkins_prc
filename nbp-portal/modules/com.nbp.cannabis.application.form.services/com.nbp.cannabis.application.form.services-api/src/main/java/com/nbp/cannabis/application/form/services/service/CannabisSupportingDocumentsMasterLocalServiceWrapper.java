/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisSupportingDocumentsMasterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMasterLocalService
 * @generated
 */
public class CannabisSupportingDocumentsMasterLocalServiceWrapper
	implements CannabisSupportingDocumentsMasterLocalService,
			   ServiceWrapper<CannabisSupportingDocumentsMasterLocalService> {

	public CannabisSupportingDocumentsMasterLocalServiceWrapper() {
		this(null);
	}

	public CannabisSupportingDocumentsMasterLocalServiceWrapper(
		CannabisSupportingDocumentsMasterLocalService
			cannabisSupportingDocumentsMasterLocalService) {

		_cannabisSupportingDocumentsMasterLocalService =
			cannabisSupportingDocumentsMasterLocalService;
	}

	/**
	 * Adds the cannabis supporting documents master to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupportingDocumentsMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupportingDocumentsMaster the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster addCannabisSupportingDocumentsMaster(
			com.nbp.cannabis.application.form.services.model.
				CannabisSupportingDocumentsMaster
					cannabisSupportingDocumentsMaster) {

		return _cannabisSupportingDocumentsMasterLocalService.
			addCannabisSupportingDocumentsMaster(
				cannabisSupportingDocumentsMaster);
	}

	/**
	 * Creates a new cannabis supporting documents master with the primary key. Does not add the cannabis supporting documents master to the database.
	 *
	 * @param cannabisSupportingDocMasterId the primary key for the new cannabis supporting documents master
	 * @return the new cannabis supporting documents master
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster
			createCannabisSupportingDocumentsMaster(
				long cannabisSupportingDocMasterId) {

		return _cannabisSupportingDocumentsMasterLocalService.
			createCannabisSupportingDocumentsMaster(
				cannabisSupportingDocMasterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupportingDocumentsMasterLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis supporting documents master from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupportingDocumentsMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupportingDocumentsMaster the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster
			deleteCannabisSupportingDocumentsMaster(
				com.nbp.cannabis.application.form.services.model.
					CannabisSupportingDocumentsMaster
						cannabisSupportingDocumentsMaster) {

		return _cannabisSupportingDocumentsMasterLocalService.
			deleteCannabisSupportingDocumentsMaster(
				cannabisSupportingDocumentsMaster);
	}

	/**
	 * Deletes the cannabis supporting documents master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupportingDocumentsMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was removed
	 * @throws PortalException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster
				deleteCannabisSupportingDocumentsMaster(
					long cannabisSupportingDocMasterId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupportingDocumentsMasterLocalService.
			deleteCannabisSupportingDocumentsMaster(
				cannabisSupportingDocMasterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupportingDocumentsMasterLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisSupportingDocumentsMasterLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisSupportingDocumentsMasterLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisSupportingDocumentsMasterLocalService.dynamicQuery();
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

		return _cannabisSupportingDocumentsMasterLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterModelImpl</code>.
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

		return _cannabisSupportingDocumentsMasterLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterModelImpl</code>.
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

		return _cannabisSupportingDocumentsMasterLocalService.dynamicQuery(
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

		return _cannabisSupportingDocumentsMasterLocalService.dynamicQueryCount(
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

		return _cannabisSupportingDocumentsMasterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster
			fetchCannabisSupportingDocumentsMaster(
				long cannabisSupportingDocMasterId) {

		return _cannabisSupportingDocumentsMasterLocalService.
			fetchCannabisSupportingDocumentsMaster(
				cannabisSupportingDocMasterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisSupportingDocumentsMasterLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis supporting documents master with the primary key.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master
	 * @throws PortalException if a cannabis supporting documents master with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster getCannabisSupportingDocumentsMaster(
				long cannabisSupportingDocMasterId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupportingDocumentsMasterLocalService.
			getCannabisSupportingDocumentsMaster(cannabisSupportingDocMasterId);
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of cannabis supporting documents masters
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupportingDocumentsMaster>
				getCannabisSupportingDocumentsMasters(int start, int end) {

		return _cannabisSupportingDocumentsMasterLocalService.
			getCannabisSupportingDocumentsMasters(start, end);
	}

	/**
	 * Returns the number of cannabis supporting documents masters.
	 *
	 * @return the number of cannabis supporting documents masters
	 */
	@Override
	public int getCannabisSupportingDocumentsMastersCount() {
		return _cannabisSupportingDocumentsMasterLocalService.
			getCannabisSupportingDocumentsMastersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisSupportingDocumentsMasterLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisSupportingDocumentsMasterLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupportingDocumentsMasterLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupportingDocumentsMaster> getSupportingDocApplicant(
				String documentTye, String userType, String applicationType) {

		return _cannabisSupportingDocumentsMasterLocalService.
			getSupportingDocApplicant(documentTye, userType, applicationType);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupportingDocumentsMaster> getSupportingDocProperty(
				String documentTye, String userType, String applicationType,
				String landType) {

		return _cannabisSupportingDocumentsMasterLocalService.
			getSupportingDocProperty(
				documentTye, userType, applicationType, landType);
	}

	/**
	 * Updates the cannabis supporting documents master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupportingDocumentsMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupportingDocumentsMaster the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupportingDocumentsMaster
			updateCannabisSupportingDocumentsMaster(
				com.nbp.cannabis.application.form.services.model.
					CannabisSupportingDocumentsMaster
						cannabisSupportingDocumentsMaster) {

		return _cannabisSupportingDocumentsMasterLocalService.
			updateCannabisSupportingDocumentsMaster(
				cannabisSupportingDocumentsMaster);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisSupportingDocumentsMasterLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisSupportingDocumentsMasterLocalService getWrappedService() {
		return _cannabisSupportingDocumentsMasterLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisSupportingDocumentsMasterLocalService
			cannabisSupportingDocumentsMasterLocalService) {

		_cannabisSupportingDocumentsMasterLocalService =
			cannabisSupportingDocumentsMasterLocalService;
	}

	private CannabisSupportingDocumentsMasterLocalService
		_cannabisSupportingDocumentsMasterLocalService;

}