/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevSharePleaseStateAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePleaseStateAddLocalService
 * @generated
 */
public class SezDevSharePleaseStateAddLocalServiceWrapper
	implements ServiceWrapper<SezDevSharePleaseStateAddLocalService>,
			   SezDevSharePleaseStateAddLocalService {

	public SezDevSharePleaseStateAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevSharePleaseStateAddLocalServiceWrapper(
		SezDevSharePleaseStateAddLocalService
			sezDevSharePleaseStateAddLocalService) {

		_sezDevSharePleaseStateAddLocalService =
			sezDevSharePleaseStateAddLocalService;
	}

	/**
	 * Adds the sez dev share please state add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePleaseStateAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePleaseStateAdd the sez dev share please state add
	 * @return the sez dev share please state add that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd addSezDevSharePleaseStateAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		return _sezDevSharePleaseStateAddLocalService.
			addSezDevSharePleaseStateAdd(sezDevSharePleaseStateAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePleaseStateAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev share please state add with the primary key. Does not add the sez dev share please state add to the database.
	 *
	 * @param sezDevPleaseStateAddId the primary key for the new sez dev share please state add
	 * @return the new sez dev share please state add
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd createSezDevSharePleaseStateAdd(
				long sezDevPleaseStateAddId) {

		return _sezDevSharePleaseStateAddLocalService.
			createSezDevSharePleaseStateAdd(sezDevPleaseStateAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePleaseStateAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev share please state add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePleaseStateAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add that was removed
	 * @throws PortalException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd deleteSezDevSharePleaseStateAdd(
					long sezDevPleaseStateAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePleaseStateAddLocalService.
			deleteSezDevSharePleaseStateAdd(sezDevPleaseStateAddId);
	}

	/**
	 * Deletes the sez dev share please state add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePleaseStateAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePleaseStateAdd the sez dev share please state add
	 * @return the sez dev share please state add that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd deleteSezDevSharePleaseStateAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		return _sezDevSharePleaseStateAddLocalService.
			deleteSezDevSharePleaseStateAdd(sezDevSharePleaseStateAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevSharePleaseStateAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevSharePleaseStateAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevSharePleaseStateAddLocalService.dynamicQuery();
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

		return _sezDevSharePleaseStateAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePleaseStateAddModelImpl</code>.
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

		return _sezDevSharePleaseStateAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePleaseStateAddModelImpl</code>.
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

		return _sezDevSharePleaseStateAddLocalService.dynamicQuery(
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

		return _sezDevSharePleaseStateAddLocalService.dynamicQueryCount(
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

		return _sezDevSharePleaseStateAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd fetchSezDevSharePleaseStateAdd(
				long sezDevPleaseStateAddId) {

		return _sezDevSharePleaseStateAddLocalService.
			fetchSezDevSharePleaseStateAdd(sezDevPleaseStateAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevSharePleaseStateAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevSharePleaseStateAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevSharePleaseStateAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePleaseStateAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd> getSezById(long sezStatusApplicationId) {

		return _sezDevSharePleaseStateAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev share please state add with the primary key.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add
	 * @throws PortalException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd getSezDevSharePleaseStateAdd(
					long sezDevPleaseStateAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePleaseStateAddLocalService.
			getSezDevSharePleaseStateAdd(sezDevPleaseStateAddId);
	}

	/**
	 * Returns a range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of sez dev share please state adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd> getSezDevSharePleaseStateAdds(
				int start, int end) {

		return _sezDevSharePleaseStateAddLocalService.
			getSezDevSharePleaseStateAdds(start, end);
	}

	/**
	 * Returns the number of sez dev share please state adds.
	 *
	 * @return the number of sez dev share please state adds
	 */
	@Override
	public int getSezDevSharePleaseStateAddsCount() {
		return _sezDevSharePleaseStateAddLocalService.
			getSezDevSharePleaseStateAddsCount();
	}

	/**
	 * Updates the sez dev share please state add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePleaseStateAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePleaseStateAdd the sez dev share please state add
	 * @return the sez dev share please state add that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePleaseStateAdd updateSezDevSharePleaseStateAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		return _sezDevSharePleaseStateAddLocalService.
			updateSezDevSharePleaseStateAdd(sezDevSharePleaseStateAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevSharePleaseStateAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevSharePleaseStateAddLocalService getWrappedService() {
		return _sezDevSharePleaseStateAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevSharePleaseStateAddLocalService
			sezDevSharePleaseStateAddLocalService) {

		_sezDevSharePleaseStateAddLocalService =
			sezDevSharePleaseStateAddLocalService;
	}

	private SezDevSharePleaseStateAddLocalService
		_sezDevSharePleaseStateAddLocalService;

}