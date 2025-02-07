/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjBusinessDetailAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailAddLocalService
 * @generated
 */
public class NcbjBusinessDetailAddLocalServiceWrapper
	implements NcbjBusinessDetailAddLocalService,
			   ServiceWrapper<NcbjBusinessDetailAddLocalService> {

	public NcbjBusinessDetailAddLocalServiceWrapper() {
		this(null);
	}

	public NcbjBusinessDetailAddLocalServiceWrapper(
		NcbjBusinessDetailAddLocalService ncbjBusinessDetailAddLocalService) {

		_ncbjBusinessDetailAddLocalService = ncbjBusinessDetailAddLocalService;
	}

	/**
	 * Adds the ncbj business detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetailAdd the ncbj business detail add
	 * @return the ncbj business detail add that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
		addNcbjBusinessDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
				ncbjBusinessDetailAdd) {

		return _ncbjBusinessDetailAddLocalService.addNcbjBusinessDetailAdd(
			ncbjBusinessDetailAdd);
	}

	/**
	 * Creates a new ncbj business detail add with the primary key. Does not add the ncbj business detail add to the database.
	 *
	 * @param ncbjBusinessDetailAddId the primary key for the new ncbj business detail add
	 * @return the new ncbj business detail add
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
		createNcbjBusinessDetailAdd(long ncbjBusinessDetailAddId) {

		return _ncbjBusinessDetailAddLocalService.createNcbjBusinessDetailAdd(
			ncbjBusinessDetailAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj business detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add that was removed
	 * @throws PortalException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
			deleteNcbjBusinessDetailAdd(long ncbjBusinessDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailAddLocalService.deleteNcbjBusinessDetailAdd(
			ncbjBusinessDetailAddId);
	}

	/**
	 * Deletes the ncbj business detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetailAdd the ncbj business detail add
	 * @return the ncbj business detail add that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
		deleteNcbjBusinessDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
				ncbjBusinessDetailAdd) {

		return _ncbjBusinessDetailAddLocalService.deleteNcbjBusinessDetailAdd(
			ncbjBusinessDetailAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjBusinessDetailAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjBusinessDetailAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjBusinessDetailAddLocalService.dynamicQuery();
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

		return _ncbjBusinessDetailAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddModelImpl</code>.
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

		return _ncbjBusinessDetailAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddModelImpl</code>.
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

		return _ncbjBusinessDetailAddLocalService.dynamicQuery(
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

		return _ncbjBusinessDetailAddLocalService.dynamicQueryCount(
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

		return _ncbjBusinessDetailAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
		fetchNcbjBusinessDetailAdd(long ncbjBusinessDetailAddId) {

		return _ncbjBusinessDetailAddLocalService.fetchNcbjBusinessDetailAdd(
			ncbjBusinessDetailAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjBusinessDetailAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjBusinessDetailAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj business detail add with the primary key.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add
	 * @throws PortalException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
			getNcbjBusinessDetailAdd(long ncbjBusinessDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailAddLocalService.getNcbjBusinessDetailAdd(
			ncbjBusinessDetailAddId);
	}

	/**
	 * Returns a range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @return the range of ncbj business detail adds
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd>
			getNcbjBusinessDetailAdds(int start, int end) {

		return _ncbjBusinessDetailAddLocalService.getNcbjBusinessDetailAdds(
			start, end);
	}

	/**
	 * Returns the number of ncbj business detail adds.
	 *
	 * @return the number of ncbj business detail adds
	 */
	@Override
	public int getNcbjBusinessDetailAddsCount() {
		return _ncbjBusinessDetailAddLocalService.
			getNcbjBusinessDetailAddsCount();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd>
			getNCBJById(long ncbjApplicationId) {

		return _ncbjBusinessDetailAddLocalService.getNCBJById(
			ncbjApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjBusinessDetailAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj business detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetailAdd the ncbj business detail add
	 * @return the ncbj business detail add that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
		updateNcbjBusinessDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd
				ncbjBusinessDetailAdd) {

		return _ncbjBusinessDetailAddLocalService.updateNcbjBusinessDetailAdd(
			ncbjBusinessDetailAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjBusinessDetailAddLocalService.getBasePersistence();
	}

	@Override
	public NcbjBusinessDetailAddLocalService getWrappedService() {
		return _ncbjBusinessDetailAddLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjBusinessDetailAddLocalService ncbjBusinessDetailAddLocalService) {

		_ncbjBusinessDetailAddLocalService = ncbjBusinessDetailAddLocalService;
	}

	private NcbjBusinessDetailAddLocalService
		_ncbjBusinessDetailAddLocalService;

}