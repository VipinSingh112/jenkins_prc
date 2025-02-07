/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSectionThreeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThreeLocalService
 * @generated
 */
public class NcbjSectionThreeLocalServiceWrapper
	implements NcbjSectionThreeLocalService,
			   ServiceWrapper<NcbjSectionThreeLocalService> {

	public NcbjSectionThreeLocalServiceWrapper() {
		this(null);
	}

	public NcbjSectionThreeLocalServiceWrapper(
		NcbjSectionThreeLocalService ncbjSectionThreeLocalService) {

		_ncbjSectionThreeLocalService = ncbjSectionThreeLocalService;
	}

	/**
	 * Adds the ncbj section three to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThree the ncbj section three
	 * @return the ncbj section three that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
		addNcbjSectionThree(
			com.nbp.ncbj.application.form.service.model.NcbjSectionThree
				ncbjSectionThree) {

		return _ncbjSectionThreeLocalService.addNcbjSectionThree(
			ncbjSectionThree);
	}

	/**
	 * Creates a new ncbj section three with the primary key. Does not add the ncbj section three to the database.
	 *
	 * @param ncbjSectionThreeId the primary key for the new ncbj section three
	 * @return the new ncbj section three
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
		createNcbjSectionThree(long ncbjSectionThreeId) {

		return _ncbjSectionThreeLocalService.createNcbjSectionThree(
			ncbjSectionThreeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionThreeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj section three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three that was removed
	 * @throws PortalException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
			deleteNcbjSectionThree(long ncbjSectionThreeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionThreeLocalService.deleteNcbjSectionThree(
			ncbjSectionThreeId);
	}

	/**
	 * Deletes the ncbj section three from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThree the ncbj section three
	 * @return the ncbj section three that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
		deleteNcbjSectionThree(
			com.nbp.ncbj.application.form.service.model.NcbjSectionThree
				ncbjSectionThree) {

		return _ncbjSectionThreeLocalService.deleteNcbjSectionThree(
			ncbjSectionThree);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionThreeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSectionThreeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSectionThreeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSectionThreeLocalService.dynamicQuery();
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

		return _ncbjSectionThreeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl</code>.
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

		return _ncbjSectionThreeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl</code>.
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

		return _ncbjSectionThreeLocalService.dynamicQuery(
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

		return _ncbjSectionThreeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjSectionThreeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
		fetchNcbjSectionThree(long ncbjSectionThreeId) {

		return _ncbjSectionThreeLocalService.fetchNcbjSectionThree(
			ncbjSectionThreeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSectionThreeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSectionThreeLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionThreeException {

		return _ncbjSectionThreeLocalService.getNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section three with the primary key.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three
	 * @throws PortalException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
			getNcbjSectionThree(long ncbjSectionThreeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionThreeLocalService.getNcbjSectionThree(
			ncbjSectionThreeId);
	}

	/**
	 * Returns a range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @return the range of ncbj section threes
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionThree>
			getNcbjSectionThrees(int start, int end) {

		return _ncbjSectionThreeLocalService.getNcbjSectionThrees(start, end);
	}

	/**
	 * Returns the number of ncbj section threes.
	 *
	 * @return the number of ncbj section threes
	 */
	@Override
	public int getNcbjSectionThreesCount() {
		return _ncbjSectionThreeLocalService.getNcbjSectionThreesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionThreeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionThreeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj section three in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThree the ncbj section three
	 * @return the ncbj section three that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionThree
		updateNcbjSectionThree(
			com.nbp.ncbj.application.form.service.model.NcbjSectionThree
				ncbjSectionThree) {

		return _ncbjSectionThreeLocalService.updateNcbjSectionThree(
			ncbjSectionThree);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSectionThreeLocalService.getBasePersistence();
	}

	@Override
	public NcbjSectionThreeLocalService getWrappedService() {
		return _ncbjSectionThreeLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionThreeLocalService ncbjSectionThreeLocalService) {

		_ncbjSectionThreeLocalService = ncbjSectionThreeLocalService;
	}

	private NcbjSectionThreeLocalService _ncbjSectionThreeLocalService;

}