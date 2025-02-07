/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraVerifyWeighingDateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDateLocalService
 * @generated
 */
public class NcraVerifyWeighingDateLocalServiceWrapper
	implements NcraVerifyWeighingDateLocalService,
			   ServiceWrapper<NcraVerifyWeighingDateLocalService> {

	public NcraVerifyWeighingDateLocalServiceWrapper() {
		this(null);
	}

	public NcraVerifyWeighingDateLocalServiceWrapper(
		NcraVerifyWeighingDateLocalService ncraVerifyWeighingDateLocalService) {

		_ncraVerifyWeighingDateLocalService =
			ncraVerifyWeighingDateLocalService;
	}

	/**
	 * Adds the ncra verify weighing date to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 * @return the ncra verify weighing date that was added
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
		addNcraVerifyWeighingDate(
			com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
				ncraVerifyWeighingDate) {

		return _ncraVerifyWeighingDateLocalService.addNcraVerifyWeighingDate(
			ncraVerifyWeighingDate);
	}

	/**
	 * Creates a new ncra verify weighing date with the primary key. Does not add the ncra verify weighing date to the database.
	 *
	 * @param ncraVerifyWeighingDateId the primary key for the new ncra verify weighing date
	 * @return the new ncra verify weighing date
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
		createNcraVerifyWeighingDate(long ncraVerifyWeighingDateId) {

		return _ncraVerifyWeighingDateLocalService.createNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDateLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncra verify weighing date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 * @throws PortalException if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
			deleteNcraVerifyWeighingDate(long ncraVerifyWeighingDateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDateLocalService.deleteNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
	}

	/**
	 * Deletes the ncra verify weighing date from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
		deleteNcraVerifyWeighingDate(
			com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
				ncraVerifyWeighingDate) {

		return _ncraVerifyWeighingDateLocalService.deleteNcraVerifyWeighingDate(
			ncraVerifyWeighingDate);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDateLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraVerifyWeighingDateLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraVerifyWeighingDateLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraVerifyWeighingDateLocalService.dynamicQuery();
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

		return _ncraVerifyWeighingDateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code>.
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

		return _ncraVerifyWeighingDateLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code>.
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

		return _ncraVerifyWeighingDateLocalService.dynamicQuery(
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

		return _ncraVerifyWeighingDateLocalService.dynamicQueryCount(
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

		return _ncraVerifyWeighingDateLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
		fetchNcraVerifyWeighingDate(long ncraVerifyWeighingDateId) {

		return _ncraVerifyWeighingDateLocalService.fetchNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraVerifyWeighingDateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraVerifyWeighingDateLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
			getNcraVerify_By_Date(long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDateException {

		return _ncraVerifyWeighingDateLocalService.getNcraVerify_By_Date(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing date with the primary key.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date
	 * @throws PortalException if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
			getNcraVerifyWeighingDate(long ncraVerifyWeighingDateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDateLocalService.getNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
	}

	/**
	 * Returns a range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @return the range of ncra verify weighing dates
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate>
			getNcraVerifyWeighingDates(int start, int end) {

		return _ncraVerifyWeighingDateLocalService.getNcraVerifyWeighingDates(
			start, end);
	}

	/**
	 * Returns the number of ncra verify weighing dates.
	 *
	 * @return the number of ncra verify weighing dates
	 */
	@Override
	public int getNcraVerifyWeighingDatesCount() {
		return _ncraVerifyWeighingDateLocalService.
			getNcraVerifyWeighingDatesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraVerifyWeighingDateLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDateLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncra verify weighing date in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 * @return the ncra verify weighing date that was updated
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
		updateNcraVerifyWeighingDate(
			com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate
				ncraVerifyWeighingDate) {

		return _ncraVerifyWeighingDateLocalService.updateNcraVerifyWeighingDate(
			ncraVerifyWeighingDate);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraVerifyWeighingDateLocalService.getBasePersistence();
	}

	@Override
	public NcraVerifyWeighingDateLocalService getWrappedService() {
		return _ncraVerifyWeighingDateLocalService;
	}

	@Override
	public void setWrappedService(
		NcraVerifyWeighingDateLocalService ncraVerifyWeighingDateLocalService) {

		_ncraVerifyWeighingDateLocalService =
			ncraVerifyWeighingDateLocalService;
	}

	private NcraVerifyWeighingDateLocalService
		_ncraVerifyWeighingDateLocalService;

}