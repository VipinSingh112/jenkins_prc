/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicSuspensionOfCetLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetLocalService
 * @generated
 */
public class MiicSuspensionOfCetLocalServiceWrapper
	implements MiicSuspensionOfCetLocalService,
			   ServiceWrapper<MiicSuspensionOfCetLocalService> {

	public MiicSuspensionOfCetLocalServiceWrapper() {
		this(null);
	}

	public MiicSuspensionOfCetLocalServiceWrapper(
		MiicSuspensionOfCetLocalService miicSuspensionOfCetLocalService) {

		_miicSuspensionOfCetLocalService = miicSuspensionOfCetLocalService;
	}

	/**
	 * Adds the miic suspension of cet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 * @return the miic suspension of cet that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
		addMiicSuspensionOfCet(
			com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
				miicSuspensionOfCet) {

		return _miicSuspensionOfCetLocalService.addMiicSuspensionOfCet(
			miicSuspensionOfCet);
	}

	/**
	 * Creates a new miic suspension of cet with the primary key. Does not add the miic suspension of cet to the database.
	 *
	 * @param miicSuspensionOfCetId the primary key for the new miic suspension of cet
	 * @return the new miic suspension of cet
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
		createMiicSuspensionOfCet(long miicSuspensionOfCetId) {

		return _miicSuspensionOfCetLocalService.createMiicSuspensionOfCet(
			miicSuspensionOfCetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic suspension of cet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 * @throws PortalException if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
			deleteMiicSuspensionOfCet(long miicSuspensionOfCetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetLocalService.deleteMiicSuspensionOfCet(
			miicSuspensionOfCetId);
	}

	/**
	 * Deletes the miic suspension of cet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
		deleteMiicSuspensionOfCet(
			com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
				miicSuspensionOfCet) {

		return _miicSuspensionOfCetLocalService.deleteMiicSuspensionOfCet(
			miicSuspensionOfCet);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicSuspensionOfCetLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicSuspensionOfCetLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicSuspensionOfCetLocalService.dynamicQuery();
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

		return _miicSuspensionOfCetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl</code>.
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

		return _miicSuspensionOfCetLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl</code>.
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

		return _miicSuspensionOfCetLocalService.dynamicQuery(
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

		return _miicSuspensionOfCetLocalService.dynamicQueryCount(dynamicQuery);
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

		return _miicSuspensionOfCetLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
		fetchMiicSuspensionOfCet(long miicSuspensionOfCetId) {

		return _miicSuspensionOfCetLocalService.fetchMiicSuspensionOfCet(
			miicSuspensionOfCetId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicSuspensionOfCetLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicSuspensionOfCetLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
			getMiicById(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetException {

		return _miicSuspensionOfCetLocalService.getMiicById(miicApplicationId);
	}

	/**
	 * Returns the miic suspension of cet with the primary key.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet
	 * @throws PortalException if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
			getMiicSuspensionOfCet(long miicSuspensionOfCetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetLocalService.getMiicSuspensionOfCet(
			miicSuspensionOfCetId);
	}

	/**
	 * Returns a range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @return the range of miic suspension of cets
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSuspensionOfCet>
			getMiicSuspensionOfCets(int start, int end) {

		return _miicSuspensionOfCetLocalService.getMiicSuspensionOfCets(
			start, end);
	}

	/**
	 * Returns the number of miic suspension of cets.
	 *
	 * @return the number of miic suspension of cets
	 */
	@Override
	public int getMiicSuspensionOfCetsCount() {
		return _miicSuspensionOfCetLocalService.getMiicSuspensionOfCetsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSuspensionOfCetLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic suspension of cet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 * @return the miic suspension of cet that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
		updateMiicSuspensionOfCet(
			com.nbp.miic.application.form.services.model.MiicSuspensionOfCet
				miicSuspensionOfCet) {

		return _miicSuspensionOfCetLocalService.updateMiicSuspensionOfCet(
			miicSuspensionOfCet);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicSuspensionOfCetLocalService.getBasePersistence();
	}

	@Override
	public MiicSuspensionOfCetLocalService getWrappedService() {
		return _miicSuspensionOfCetLocalService;
	}

	@Override
	public void setWrappedService(
		MiicSuspensionOfCetLocalService miicSuspensionOfCetLocalService) {

		_miicSuspensionOfCetLocalService = miicSuspensionOfCetLocalService;
	}

	private MiicSuspensionOfCetLocalService _miicSuspensionOfCetLocalService;

}