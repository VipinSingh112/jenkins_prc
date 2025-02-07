/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicSuspensionOfCetAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetAddLocalService
 * @generated
 */
public class MiicSuspensionOfCetAddLocalServiceWrapper
	implements MiicSuspensionOfCetAddLocalService,
			   ServiceWrapper<MiicSuspensionOfCetAddLocalService> {

	public MiicSuspensionOfCetAddLocalServiceWrapper() {
		this(null);
	}

	public MiicSuspensionOfCetAddLocalServiceWrapper(
		MiicSuspensionOfCetAddLocalService miicSuspensionOfCetAddLocalService) {

		_miicSuspensionOfCetAddLocalService =
			miicSuspensionOfCetAddLocalService;
	}

	/**
	 * Adds the miic suspension of cet add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCetAdd the miic suspension of cet add
	 * @return the miic suspension of cet add that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
		addMiicSuspensionOfCetAdd(
			com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
				miicSuspensionOfCetAdd) {

		return _miicSuspensionOfCetAddLocalService.addMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAdd);
	}

	/**
	 * Creates a new miic suspension of cet add with the primary key. Does not add the miic suspension of cet add to the database.
	 *
	 * @param miicSuspensionOfCetAddId the primary key for the new miic suspension of cet add
	 * @return the new miic suspension of cet add
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
		createMiicSuspensionOfCetAdd(long miicSuspensionOfCetAddId) {

		return _miicSuspensionOfCetAddLocalService.createMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic suspension of cet add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add that was removed
	 * @throws PortalException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
			deleteMiicSuspensionOfCetAdd(long miicSuspensionOfCetAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetAddLocalService.deleteMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAddId);
	}

	/**
	 * Deletes the miic suspension of cet add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCetAdd the miic suspension of cet add
	 * @return the miic suspension of cet add that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
		deleteMiicSuspensionOfCetAdd(
			com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
				miicSuspensionOfCetAdd) {

		return _miicSuspensionOfCetAddLocalService.deleteMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicSuspensionOfCetAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicSuspensionOfCetAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicSuspensionOfCetAddLocalService.dynamicQuery();
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

		return _miicSuspensionOfCetAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddModelImpl</code>.
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

		return _miicSuspensionOfCetAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddModelImpl</code>.
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

		return _miicSuspensionOfCetAddLocalService.dynamicQuery(
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

		return _miicSuspensionOfCetAddLocalService.dynamicQueryCount(
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

		return _miicSuspensionOfCetAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
		fetchMiicSuspensionOfCetAdd(long miicSuspensionOfCetAddId) {

		return _miicSuspensionOfCetAddLocalService.fetchMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicSuspensionOfCetAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicSuspensionOfCetAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd>
			getMiicById(long applicationId) {

		return _miicSuspensionOfCetAddLocalService.getMiicById(applicationId);
	}

	/**
	 * Returns the miic suspension of cet add with the primary key.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add
	 * @throws PortalException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
			getMiicSuspensionOfCetAdd(long miicSuspensionOfCetAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetAddLocalService.getMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAddId);
	}

	/**
	 * Returns a range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of miic suspension of cet adds
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd>
			getMiicSuspensionOfCetAdds(int start, int end) {

		return _miicSuspensionOfCetAddLocalService.getMiicSuspensionOfCetAdds(
			start, end);
	}

	/**
	 * Returns the number of miic suspension of cet adds.
	 *
	 * @return the number of miic suspension of cet adds
	 */
	@Override
	public int getMiicSuspensionOfCetAddsCount() {
		return _miicSuspensionOfCetAddLocalService.
			getMiicSuspensionOfCetAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSuspensionOfCetAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSuspensionOfCetAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic suspension of cet add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCetAdd the miic suspension of cet add
	 * @return the miic suspension of cet add that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
		updateMiicSuspensionOfCetAdd(
			com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd
				miicSuspensionOfCetAdd) {

		return _miicSuspensionOfCetAddLocalService.updateMiicSuspensionOfCetAdd(
			miicSuspensionOfCetAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicSuspensionOfCetAddLocalService.getBasePersistence();
	}

	@Override
	public MiicSuspensionOfCetAddLocalService getWrappedService() {
		return _miicSuspensionOfCetAddLocalService;
	}

	@Override
	public void setWrappedService(
		MiicSuspensionOfCetAddLocalService miicSuspensionOfCetAddLocalService) {

		_miicSuspensionOfCetAddLocalService =
			miicSuspensionOfCetAddLocalService;
	}

	private MiicSuspensionOfCetAddLocalService
		_miicSuspensionOfCetAddLocalService;

}