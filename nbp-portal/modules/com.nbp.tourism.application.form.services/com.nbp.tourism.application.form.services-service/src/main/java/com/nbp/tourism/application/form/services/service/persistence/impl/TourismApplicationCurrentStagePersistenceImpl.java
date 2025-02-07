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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismApplicationCurrentStageException;
import com.nbp.tourism.application.form.services.model.TourismApplicationCurrentStage;
import com.nbp.tourism.application.form.services.model.TourismApplicationCurrentStageTable;
import com.nbp.tourism.application.form.services.model.impl.TourismApplicationCurrentStageImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismApplicationCurrentStageModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationCurrentStagePersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationCurrentStageUtil;
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
 * The persistence implementation for the tourism application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismApplicationCurrentStagePersistence.class)
public class TourismApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<TourismApplicationCurrentStage>
	implements TourismApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismApplicationCurrentStageUtil</code> to access the tourism application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismApplicationCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTA_Stage_TAI;
	private FinderPath _finderPathCountBygetTA_Stage_TAI;

	/**
	 * Returns the tourism application current stage where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application current stage
	 * @throws NoSuchTourismApplicationCurrentStageException if a matching tourism application current stage could not be found
	 */
	@Override
	public TourismApplicationCurrentStage findBygetTA_Stage_TAI(
			long tourismApplicationId)
		throws NoSuchTourismApplicationCurrentStageException {

		TourismApplicationCurrentStage tourismApplicationCurrentStage =
			fetchBygetTA_Stage_TAI(tourismApplicationId);

		if (tourismApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismApplicationCurrentStageException(
				sb.toString());
		}

		return tourismApplicationCurrentStage;
	}

	/**
	 * Returns the tourism application current stage where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application current stage, or <code>null</code> if a matching tourism application current stage could not be found
	 */
	@Override
	public TourismApplicationCurrentStage fetchBygetTA_Stage_TAI(
		long tourismApplicationId) {

		return fetchBygetTA_Stage_TAI(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism application current stage where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application current stage, or <code>null</code> if a matching tourism application current stage could not be found
	 */
	@Override
	public TourismApplicationCurrentStage fetchBygetTA_Stage_TAI(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTA_Stage_TAI, finderArgs, this);
		}

		if (result instanceof TourismApplicationCurrentStage) {
			TourismApplicationCurrentStage tourismApplicationCurrentStage =
				(TourismApplicationCurrentStage)result;

			if (tourismApplicationId !=
					tourismApplicationCurrentStage.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETTA_STAGE_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTA_Stage_TAI, finderArgs,
							list);
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
								"TourismApplicationCurrentStagePersistenceImpl.fetchBygetTA_Stage_TAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplicationCurrentStage
						tourismApplicationCurrentStage = list.get(0);

					result = tourismApplicationCurrentStage;

					cacheResult(tourismApplicationCurrentStage);
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
			return (TourismApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the tourism application current stage where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application current stage that was removed
	 */
	@Override
	public TourismApplicationCurrentStage removeBygetTA_Stage_TAI(
			long tourismApplicationId)
		throws NoSuchTourismApplicationCurrentStageException {

		TourismApplicationCurrentStage tourismApplicationCurrentStage =
			findBygetTA_Stage_TAI(tourismApplicationId);

		return remove(tourismApplicationCurrentStage);
	}

	/**
	 * Returns the number of tourism application current stages where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application current stages
	 */
	@Override
	public int countBygetTA_Stage_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTA_Stage_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETTA_STAGE_TAI_TOURISMAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETTA_STAGE_TAI_TOURISMAPPLICATIONID_2 =
			"tourismApplicationCurrentStage.tourismApplicationId = ?";

	public TourismApplicationCurrentStagePersistenceImpl() {
		setModelClass(TourismApplicationCurrentStage.class);

		setModelImplClass(TourismApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(TourismApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the tourism application current stage in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationCurrentStage the tourism application current stage
	 */
	@Override
	public void cacheResult(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		entityCache.putResult(
			TourismApplicationCurrentStageImpl.class,
			tourismApplicationCurrentStage.getPrimaryKey(),
			tourismApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetTA_Stage_TAI,
			new Object[] {
				tourismApplicationCurrentStage.getTourismApplicationId()
			},
			tourismApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism application current stages in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationCurrentStages the tourism application current stages
	 */
	@Override
	public void cacheResult(
		List<TourismApplicationCurrentStage> tourismApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismApplicationCurrentStage tourismApplicationCurrentStage :
				tourismApplicationCurrentStages) {

			if (entityCache.getResult(
					TourismApplicationCurrentStageImpl.class,
					tourismApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(tourismApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all tourism application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismApplicationCurrentStageImpl.class);

		finderCache.clearCache(TourismApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the tourism application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		entityCache.removeResult(
			TourismApplicationCurrentStageImpl.class,
			tourismApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<TourismApplicationCurrentStage> tourismApplicationCurrentStages) {

		for (TourismApplicationCurrentStage tourismApplicationCurrentStage :
				tourismApplicationCurrentStages) {

			entityCache.removeResult(
				TourismApplicationCurrentStageImpl.class,
				tourismApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismApplicationCurrentStageModelImpl
			tourismApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			tourismApplicationCurrentStageModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTA_Stage_TAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTA_Stage_TAI, args,
			tourismApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new tourism application current stage with the primary key. Does not add the tourism application current stage to the database.
	 *
	 * @param tourismAppliCurrentStageId the primary key for the new tourism application current stage
	 * @return the new tourism application current stage
	 */
	@Override
	public TourismApplicationCurrentStage create(
		long tourismAppliCurrentStageId) {

		TourismApplicationCurrentStage tourismApplicationCurrentStage =
			new TourismApplicationCurrentStageImpl();

		tourismApplicationCurrentStage.setNew(true);
		tourismApplicationCurrentStage.setPrimaryKey(
			tourismAppliCurrentStageId);

		tourismApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismApplicationCurrentStage;
	}

	/**
	 * Removes the tourism application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage that was removed
	 * @throws NoSuchTourismApplicationCurrentStageException if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public TourismApplicationCurrentStage remove(
			long tourismAppliCurrentStageId)
		throws NoSuchTourismApplicationCurrentStageException {

		return remove((Serializable)tourismAppliCurrentStageId);
	}

	/**
	 * Removes the tourism application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism application current stage
	 * @return the tourism application current stage that was removed
	 * @throws NoSuchTourismApplicationCurrentStageException if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public TourismApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchTourismApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			TourismApplicationCurrentStage tourismApplicationCurrentStage =
				(TourismApplicationCurrentStage)session.get(
					TourismApplicationCurrentStageImpl.class, primaryKey);

			if (tourismApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismApplicationCurrentStage);
		}
		catch (NoSuchTourismApplicationCurrentStageException
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
	protected TourismApplicationCurrentStage removeImpl(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismApplicationCurrentStage)) {
				tourismApplicationCurrentStage =
					(TourismApplicationCurrentStage)session.get(
						TourismApplicationCurrentStageImpl.class,
						tourismApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (tourismApplicationCurrentStage != null) {
				session.delete(tourismApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismApplicationCurrentStage != null) {
			clearCache(tourismApplicationCurrentStage);
		}

		return tourismApplicationCurrentStage;
	}

	@Override
	public TourismApplicationCurrentStage updateImpl(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		boolean isNew = tourismApplicationCurrentStage.isNew();

		if (!(tourismApplicationCurrentStage instanceof
				TourismApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismApplicationCurrentStage implementation " +
					tourismApplicationCurrentStage.getClass());
		}

		TourismApplicationCurrentStageModelImpl
			tourismApplicationCurrentStageModelImpl =
				(TourismApplicationCurrentStageModelImpl)
					tourismApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismApplicationCurrentStage.setCreateDate(date);
			}
			else {
				tourismApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				tourismApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismApplicationCurrentStage);
			}
			else {
				tourismApplicationCurrentStage =
					(TourismApplicationCurrentStage)session.merge(
						tourismApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismApplicationCurrentStageImpl.class,
			tourismApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(tourismApplicationCurrentStageModelImpl);

		if (isNew) {
			tourismApplicationCurrentStage.setNew(false);
		}

		tourismApplicationCurrentStage.resetOriginalValues();

		return tourismApplicationCurrentStage;
	}

	/**
	 * Returns the tourism application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism application current stage
	 * @return the tourism application current stage
	 * @throws NoSuchTourismApplicationCurrentStageException if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public TourismApplicationCurrentStage findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismApplicationCurrentStageException {

		TourismApplicationCurrentStage tourismApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (tourismApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismApplicationCurrentStage;
	}

	/**
	 * Returns the tourism application current stage with the primary key or throws a <code>NoSuchTourismApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage
	 * @throws NoSuchTourismApplicationCurrentStageException if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public TourismApplicationCurrentStage findByPrimaryKey(
			long tourismAppliCurrentStageId)
		throws NoSuchTourismApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)tourismAppliCurrentStageId);
	}

	/**
	 * Returns the tourism application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage, or <code>null</code> if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public TourismApplicationCurrentStage fetchByPrimaryKey(
		long tourismAppliCurrentStageId) {

		return fetchByPrimaryKey((Serializable)tourismAppliCurrentStageId);
	}

	/**
	 * Returns all the tourism application current stages.
	 *
	 * @return the tourism application current stages
	 */
	@Override
	public List<TourismApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @return the range of tourism application current stages
	 */
	@Override
	public List<TourismApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application current stages
	 */
	@Override
	public List<TourismApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application current stages
	 */
	@Override
	public List<TourismApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationCurrentStage> orderByComparator,
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

		List<TourismApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					TourismApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the tourism application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismApplicationCurrentStage tourismApplicationCurrentStage :
				findAll()) {

			remove(tourismApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of tourism application current stages.
	 *
	 * @return the number of tourism application current stages
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
					_SQL_COUNT_TOURISMAPPLICATIONCURRENTSTAGE);

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
		return "tourismAppliCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism application current stage persistence.
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

		_finderPathFetchBygetTA_Stage_TAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTA_Stage_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTA_Stage_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTA_Stage_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			TourismApplicationCurrentStageImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMAPPLICATIONCURRENTSTAGE =
		"SELECT tourismApplicationCurrentStage FROM TourismApplicationCurrentStage tourismApplicationCurrentStage";

	private static final String
		_SQL_SELECT_TOURISMAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT tourismApplicationCurrentStage FROM TourismApplicationCurrentStage tourismApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_TOURISMAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(tourismApplicationCurrentStage) FROM TourismApplicationCurrentStage tourismApplicationCurrentStage";

	private static final String
		_SQL_COUNT_TOURISMAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT COUNT(tourismApplicationCurrentStage) FROM TourismApplicationCurrentStage tourismApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}