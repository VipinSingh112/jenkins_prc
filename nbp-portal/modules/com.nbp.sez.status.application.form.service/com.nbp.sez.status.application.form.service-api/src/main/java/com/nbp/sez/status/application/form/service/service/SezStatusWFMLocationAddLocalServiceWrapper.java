/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusWFMLocationAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAddLocalService
 * @generated
 */
public class SezStatusWFMLocationAddLocalServiceWrapper
	implements ServiceWrapper<SezStatusWFMLocationAddLocalService>,
			   SezStatusWFMLocationAddLocalService {

	public SezStatusWFMLocationAddLocalServiceWrapper() {
		this(null);
	}

	public SezStatusWFMLocationAddLocalServiceWrapper(
		SezStatusWFMLocationAddLocalService
			sezStatusWFMLocationAddLocalService) {

		_sezStatusWFMLocationAddLocalService =
			sezStatusWFMLocationAddLocalService;
	}

	/**
	 * Adds the sez status wfm location add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFMLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFMLocationAdd the sez status wfm location add
	 * @return the sez status wfm location add that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd addSezStatusWFMLocationAdd(
				com.nbp.sez.status.application.form.service.model.
					SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		return _sezStatusWFMLocationAddLocalService.addSezStatusWFMLocationAdd(
			sezStatusWFMLocationAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFMLocationAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status wfm location add with the primary key. Does not add the sez status wfm location add to the database.
	 *
	 * @param sezStatusWFHLocId the primary key for the new sez status wfm location add
	 * @return the new sez status wfm location add
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd createSezStatusWFMLocationAdd(
				long sezStatusWFHLocId) {

		return _sezStatusWFMLocationAddLocalService.
			createSezStatusWFMLocationAdd(sezStatusWFHLocId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFMLocationAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status wfm location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFMLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add that was removed
	 * @throws PortalException if a sez status wfm location add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd deleteSezStatusWFMLocationAdd(
					long sezStatusWFHLocId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFMLocationAddLocalService.
			deleteSezStatusWFMLocationAdd(sezStatusWFHLocId);
	}

	/**
	 * Deletes the sez status wfm location add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFMLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFMLocationAdd the sez status wfm location add
	 * @return the sez status wfm location add that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd deleteSezStatusWFMLocationAdd(
				com.nbp.sez.status.application.form.service.model.
					SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		return _sezStatusWFMLocationAddLocalService.
			deleteSezStatusWFMLocationAdd(sezStatusWFMLocationAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusWFMLocationAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusWFMLocationAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusWFMLocationAddLocalService.dynamicQuery();
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

		return _sezStatusWFMLocationAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWFMLocationAddModelImpl</code>.
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

		return _sezStatusWFMLocationAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWFMLocationAddModelImpl</code>.
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

		return _sezStatusWFMLocationAddLocalService.dynamicQuery(
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

		return _sezStatusWFMLocationAddLocalService.dynamicQueryCount(
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

		return _sezStatusWFMLocationAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd fetchSezStatusWFMLocationAdd(
				long sezStatusWFHLocId) {

		return _sezStatusWFMLocationAddLocalService.
			fetchSezStatusWFMLocationAdd(sezStatusWFHLocId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusWFMLocationAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusWFMLocationAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWFMLocationAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFMLocationAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez status wfm location add with the primary key.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add
	 * @throws PortalException if a sez status wfm location add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd getSezStatusWFMLocationAdd(
					long sezStatusWFHLocId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFMLocationAddLocalService.getSezStatusWFMLocationAdd(
			sezStatusWFHLocId);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd getSezStatusWFMLocationAddById(
					long sezStatusApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezStatusWFMLocationAddException {

		return _sezStatusWFMLocationAddLocalService.
			getSezStatusWFMLocationAddById(sezStatusApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd> getSezStatusWFMLocationAddListById(
				long sezStatusApplicationId) {

		return _sezStatusWFMLocationAddLocalService.
			getSezStatusWFMLocationAddListById(sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @return the range of sez status wfm location adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd> getSezStatusWFMLocationAdds(
				int start, int end) {

		return _sezStatusWFMLocationAddLocalService.getSezStatusWFMLocationAdds(
			start, end);
	}

	/**
	 * Returns the number of sez status wfm location adds.
	 *
	 * @return the number of sez status wfm location adds
	 */
	@Override
	public int getSezStatusWFMLocationAddsCount() {
		return _sezStatusWFMLocationAddLocalService.
			getSezStatusWFMLocationAddsCount();
	}

	/**
	 * Updates the sez status wfm location add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFMLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFMLocationAdd the sez status wfm location add
	 * @return the sez status wfm location add that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezStatusWFMLocationAdd updateSezStatusWFMLocationAdd(
				com.nbp.sez.status.application.form.service.model.
					SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		return _sezStatusWFMLocationAddLocalService.
			updateSezStatusWFMLocationAdd(sezStatusWFMLocationAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusWFMLocationAddLocalService.getBasePersistence();
	}

	@Override
	public SezStatusWFMLocationAddLocalService getWrappedService() {
		return _sezStatusWFMLocationAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusWFMLocationAddLocalService
			sezStatusWFMLocationAddLocalService) {

		_sezStatusWFMLocationAddLocalService =
			sezStatusWFMLocationAddLocalService;
	}

	private SezStatusWFMLocationAddLocalService
		_sezStatusWFMLocationAddLocalService;

}