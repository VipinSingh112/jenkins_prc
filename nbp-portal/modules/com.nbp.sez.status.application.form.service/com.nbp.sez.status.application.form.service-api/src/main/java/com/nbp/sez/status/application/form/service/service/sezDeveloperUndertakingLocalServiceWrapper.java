/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link sezDeveloperUndertakingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertakingLocalService
 * @generated
 */
public class sezDeveloperUndertakingLocalServiceWrapper
	implements ServiceWrapper<sezDeveloperUndertakingLocalService>,
			   sezDeveloperUndertakingLocalService {

	public sezDeveloperUndertakingLocalServiceWrapper() {
		this(null);
	}

	public sezDeveloperUndertakingLocalServiceWrapper(
		sezDeveloperUndertakingLocalService
			sezDeveloperUndertakingLocalService) {

		_sezDeveloperUndertakingLocalService =
			sezDeveloperUndertakingLocalService;
	}

	/**
	 * Adds the sez developer undertaking to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezDeveloperUndertakingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperUndertaking the sez developer undertaking
	 * @return the sez developer undertaking that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking addsezDeveloperUndertaking(
				com.nbp.sez.status.application.form.service.model.
					sezDeveloperUndertaking sezDeveloperUndertaking) {

		return _sezDeveloperUndertakingLocalService.addsezDeveloperUndertaking(
			sezDeveloperUndertaking);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperUndertakingLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez developer undertaking with the primary key. Does not add the sez developer undertaking to the database.
	 *
	 * @param sezDeveloperUndertakingId the primary key for the new sez developer undertaking
	 * @return the new sez developer undertaking
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking createsezDeveloperUndertaking(
				long sezDeveloperUndertakingId) {

		return _sezDeveloperUndertakingLocalService.
			createsezDeveloperUndertaking(sezDeveloperUndertakingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperUndertakingLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez developer undertaking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezDeveloperUndertakingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking that was removed
	 * @throws PortalException if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking deletesezDeveloperUndertaking(
					long sezDeveloperUndertakingId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperUndertakingLocalService.
			deletesezDeveloperUndertaking(sezDeveloperUndertakingId);
	}

	/**
	 * Deletes the sez developer undertaking from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezDeveloperUndertakingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperUndertaking the sez developer undertaking
	 * @return the sez developer undertaking that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking deletesezDeveloperUndertaking(
				com.nbp.sez.status.application.form.service.model.
					sezDeveloperUndertaking sezDeveloperUndertaking) {

		return _sezDeveloperUndertakingLocalService.
			deletesezDeveloperUndertaking(sezDeveloperUndertaking);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDeveloperUndertakingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDeveloperUndertakingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDeveloperUndertakingLocalService.dynamicQuery();
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

		return _sezDeveloperUndertakingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingModelImpl</code>.
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

		return _sezDeveloperUndertakingLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingModelImpl</code>.
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

		return _sezDeveloperUndertakingLocalService.dynamicQuery(
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

		return _sezDeveloperUndertakingLocalService.dynamicQueryCount(
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

		return _sezDeveloperUndertakingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking fetchsezDeveloperUndertaking(
				long sezDeveloperUndertakingId) {

		return _sezDeveloperUndertakingLocalService.
			fetchsezDeveloperUndertaking(sezDeveloperUndertakingId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDeveloperUndertakingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDeveloperUndertakingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDeveloperUndertakingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperUndertakingLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking getSezById(long sezStatusApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchsezDeveloperUndertakingException {

		return _sezDeveloperUndertakingLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez developer undertaking with the primary key.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking
	 * @throws PortalException if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking getsezDeveloperUndertaking(
					long sezDeveloperUndertakingId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDeveloperUndertakingLocalService.getsezDeveloperUndertaking(
			sezDeveloperUndertakingId);
	}

	/**
	 * Returns a range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @return the range of sez developer undertakings
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking> getsezDeveloperUndertakings(
				int start, int end) {

		return _sezDeveloperUndertakingLocalService.getsezDeveloperUndertakings(
			start, end);
	}

	/**
	 * Returns the number of sez developer undertakings.
	 *
	 * @return the number of sez developer undertakings
	 */
	@Override
	public int getsezDeveloperUndertakingsCount() {
		return _sezDeveloperUndertakingLocalService.
			getsezDeveloperUndertakingsCount();
	}

	/**
	 * Updates the sez developer undertaking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect sezDeveloperUndertakingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperUndertaking the sez developer undertaking
	 * @return the sez developer undertaking that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			sezDeveloperUndertaking updatesezDeveloperUndertaking(
				com.nbp.sez.status.application.form.service.model.
					sezDeveloperUndertaking sezDeveloperUndertaking) {

		return _sezDeveloperUndertakingLocalService.
			updatesezDeveloperUndertaking(sezDeveloperUndertaking);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDeveloperUndertakingLocalService.getBasePersistence();
	}

	@Override
	public sezDeveloperUndertakingLocalService getWrappedService() {
		return _sezDeveloperUndertakingLocalService;
	}

	@Override
	public void setWrappedService(
		sezDeveloperUndertakingLocalService
			sezDeveloperUndertakingLocalService) {

		_sezDeveloperUndertakingLocalService =
			sezDeveloperUndertakingLocalService;
	}

	private sezDeveloperUndertakingLocalService
		_sezDeveloperUndertakingLocalService;

}