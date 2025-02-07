/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccommodationFormException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationForm;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the tourism bona accommodation form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAccommodationFormPersistence.class)
public class TourismBonaAccommodationFormPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAccommodationForm>
	implements TourismBonaAccommodationFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAccommodationFormUtil</code> to access the tourism bona accommodation form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAccommodationFormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTourismById;
	private FinderPath _finderPathCountBygetTourismById;

	/**
	 * Returns the tourism bona accommodation form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form
	 * @throws NoSuchTourismBonaAccommodationFormException if a matching tourism bona accommodation form could not be found
	 */
	@Override
	public TourismBonaAccommodationForm findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormException {

		TourismBonaAccommodationForm tourismBonaAccommodationForm =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaAccommodationForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAccommodationFormException(
				sb.toString());
		}

		return tourismBonaAccommodationForm;
	}

	/**
	 * Returns the tourism bona accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form, or <code>null</code> if a matching tourism bona accommodation form could not be found
	 */
	@Override
	public TourismBonaAccommodationForm fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form, or <code>null</code> if a matching tourism bona accommodation form could not be found
	 */
	@Override
	public TourismBonaAccommodationForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs, this);
		}

		if (result instanceof TourismBonaAccommodationForm) {
			TourismBonaAccommodationForm tourismBonaAccommodationForm =
				(TourismBonaAccommodationForm)result;

			if (tourismApplicationId !=
					tourismBonaAccommodationForm.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAACCOMMODATIONFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAccommodationForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismBonaAccommodationFormPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAccommodationForm tourismBonaAccommodationForm =
						list.get(0);

					result = tourismBonaAccommodationForm;

					cacheResult(tourismBonaAccommodationForm);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TourismBonaAccommodationForm)result;
		}
	}

	/**
	 * Removes the tourism bona accommodation form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona accommodation form that was removed
	 */
	@Override
	public TourismBonaAccommodationForm removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormException {

		TourismBonaAccommodationForm tourismBonaAccommodationForm =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaAccommodationForm);
	}

	/**
	 * Returns the number of tourism bona accommodation forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona accommodation forms
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAACCOMMODATIONFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2 =
			"tourismBonaAccommodationForm.tourismApplicationId = ?";

	public TourismBonaAccommodationFormPersistenceImpl() {
		setModelClass(TourismBonaAccommodationForm.class);

		setModelImplClass(TourismBonaAccommodationFormImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAccommodationFormTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona accommodation form in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationForm the tourism bona accommodation form
	 */
	@Override
	public void cacheResult(
		TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		entityCache.putResult(
			TourismBonaAccommodationFormImpl.class,
			tourismBonaAccommodationForm.getPrimaryKey(),
			tourismBonaAccommodationForm);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaAccommodationForm.getTourismApplicationId()
			},
			tourismBonaAccommodationForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona accommodation forms in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationForms the tourism bona accommodation forms
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAccommodationForm> tourismBonaAccommodationForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAccommodationForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAccommodationForm tourismBonaAccommodationForm :
				tourismBonaAccommodationForms) {

			if (entityCache.getResult(
					TourismBonaAccommodationFormImpl.class,
					tourismBonaAccommodationForm.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAccommodationForm);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona accommodation forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAccommodationFormImpl.class);

		finderCache.clearCache(TourismBonaAccommodationFormImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona accommodation form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		entityCache.removeResult(
			TourismBonaAccommodationFormImpl.class,
			tourismBonaAccommodationForm);
	}

	@Override
	public void clearCache(
		List<TourismBonaAccommodationForm> tourismBonaAccommodationForms) {

		for (TourismBonaAccommodationForm tourismBonaAccommodationForm :
				tourismBonaAccommodationForms) {

			entityCache.removeResult(
				TourismBonaAccommodationFormImpl.class,
				tourismBonaAccommodationForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAccommodationFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAccommodationFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAccommodationFormModelImpl
			tourismBonaAccommodationFormModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAccommodationFormModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAccommodationFormModelImpl);
	}

	/**
	 * Creates a new tourism bona accommodation form with the primary key. Does not add the tourism bona accommodation form to the database.
	 *
	 * @param tourismBonaAFId the primary key for the new tourism bona accommodation form
	 * @return the new tourism bona accommodation form
	 */
	@Override
	public TourismBonaAccommodationForm create(long tourismBonaAFId) {
		TourismBonaAccommodationForm tourismBonaAccommodationForm =
			new TourismBonaAccommodationFormImpl();

		tourismBonaAccommodationForm.setNew(true);
		tourismBonaAccommodationForm.setPrimaryKey(tourismBonaAFId);

		tourismBonaAccommodationForm.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAccommodationForm;
	}

	/**
	 * Removes the tourism bona accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was removed
	 * @throws NoSuchTourismBonaAccommodationFormException if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationForm remove(long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormException {

		return remove((Serializable)tourismBonaAFId);
	}

	/**
	 * Removes the tourism bona accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was removed
	 * @throws NoSuchTourismBonaAccommodationFormException if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationForm remove(Serializable primaryKey)
		throws NoSuchTourismBonaAccommodationFormException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAccommodationForm tourismBonaAccommodationForm =
				(TourismBonaAccommodationForm)session.get(
					TourismBonaAccommodationFormImpl.class, primaryKey);

			if (tourismBonaAccommodationForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAccommodationFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAccommodationForm);
		}
		catch (NoSuchTourismBonaAccommodationFormException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TourismBonaAccommodationForm removeImpl(
		TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAccommodationForm)) {
				tourismBonaAccommodationForm =
					(TourismBonaAccommodationForm)session.get(
						TourismBonaAccommodationFormImpl.class,
						tourismBonaAccommodationForm.getPrimaryKeyObj());
			}

			if (tourismBonaAccommodationForm != null) {
				session.delete(tourismBonaAccommodationForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAccommodationForm != null) {
			clearCache(tourismBonaAccommodationForm);
		}

		return tourismBonaAccommodationForm;
	}

	@Override
	public TourismBonaAccommodationForm updateImpl(
		TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		boolean isNew = tourismBonaAccommodationForm.isNew();

		if (!(tourismBonaAccommodationForm instanceof
				TourismBonaAccommodationFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaAccommodationForm.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAccommodationForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAccommodationForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAccommodationForm implementation " +
					tourismBonaAccommodationForm.getClass());
		}

		TourismBonaAccommodationFormModelImpl
			tourismBonaAccommodationFormModelImpl =
				(TourismBonaAccommodationFormModelImpl)
					tourismBonaAccommodationForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaAccommodationForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaAccommodationForm.setCreateDate(date);
			}
			else {
				tourismBonaAccommodationForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAccommodationFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAccommodationForm.setModifiedDate(date);
			}
			else {
				tourismBonaAccommodationForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAccommodationForm);
			}
			else {
				tourismBonaAccommodationForm =
					(TourismBonaAccommodationForm)session.merge(
						tourismBonaAccommodationForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAccommodationFormImpl.class,
			tourismBonaAccommodationFormModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAccommodationFormModelImpl);

		if (isNew) {
			tourismBonaAccommodationForm.setNew(false);
		}

		tourismBonaAccommodationForm.resetOriginalValues();

		return tourismBonaAccommodationForm;
	}

	/**
	 * Returns the tourism bona accommodation form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form
	 * @throws NoSuchTourismBonaAccommodationFormException if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationForm findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaAccommodationFormException {

		TourismBonaAccommodationForm tourismBonaAccommodationForm =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaAccommodationForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAccommodationFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAccommodationForm;
	}

	/**
	 * Returns the tourism bona accommodation form with the primary key or throws a <code>NoSuchTourismBonaAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form
	 * @throws NoSuchTourismBonaAccommodationFormException if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationForm findByPrimaryKey(long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormException {

		return findByPrimaryKey((Serializable)tourismBonaAFId);
	}

	/**
	 * Returns the tourism bona accommodation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form, or <code>null</code> if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationForm fetchByPrimaryKey(
		long tourismBonaAFId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAFId);
	}

	/**
	 * Returns all the tourism bona accommodation forms.
	 *
	 * @return the tourism bona accommodation forms
	 */
	@Override
	public List<TourismBonaAccommodationForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @return the range of tourism bona accommodation forms
	 */
	@Override
	public List<TourismBonaAccommodationForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona accommodation forms
	 */
	@Override
	public List<TourismBonaAccommodationForm> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccommodationForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona accommodation forms
	 */
	@Override
	public List<TourismBonaAccommodationForm> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccommodationForm> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<TourismBonaAccommodationForm> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAccommodationForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAACCOMMODATIONFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAACCOMMODATIONFORM;

				sql = sql.concat(
					TourismBonaAccommodationFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAccommodationForm>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tourism bona accommodation forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAccommodationForm tourismBonaAccommodationForm :
				findAll()) {

			remove(tourismBonaAccommodationForm);
		}
	}

	/**
	 * Returns the number of tourism bona accommodation forms.
	 *
	 * @return the number of tourism bona accommodation forms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_TOURISMBONAACCOMMODATIONFORM);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "tourismBonaAFId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAACCOMMODATIONFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAccommodationFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona accommodation form persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismBonaAccommodationFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAccommodationFormUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaAccommodationFormImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMBONAACCOMMODATIONFORM =
		"SELECT tourismBonaAccommodationForm FROM TourismBonaAccommodationForm tourismBonaAccommodationForm";

	private static final String _SQL_SELECT_TOURISMBONAACCOMMODATIONFORM_WHERE =
		"SELECT tourismBonaAccommodationForm FROM TourismBonaAccommodationForm tourismBonaAccommodationForm WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAACCOMMODATIONFORM =
		"SELECT COUNT(tourismBonaAccommodationForm) FROM TourismBonaAccommodationForm tourismBonaAccommodationForm";

	private static final String _SQL_COUNT_TOURISMBONAACCOMMODATIONFORM_WHERE =
		"SELECT COUNT(tourismBonaAccommodationForm) FROM TourismBonaAccommodationForm tourismBonaAccommodationForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAccommodationForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAccommodationForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAccommodationForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAccommodationFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}