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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransContractSignException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransContractSign;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransContractSignTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransContractSignImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransContractSignModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransContractSignPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransContractSignUtil;
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
 * The persistence implementation for the tourism bona ground trans contract sign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaGroundTransContractSignPersistence.class)
public class TourismBonaGroundTransContractSignPersistenceImpl
	extends BasePersistenceImpl<TourismBonaGroundTransContractSign>
	implements TourismBonaGroundTransContractSignPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaGroundTransContractSignUtil</code> to access the tourism bona ground trans contract sign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaGroundTransContractSignImpl.class.getName();

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
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransContractSignException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a matching tourism bona ground trans contract sign could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransContractSignException {

		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaGroundTransContractSign == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaGroundTransContractSignException(
				sb.toString());
		}

		return tourismBonaGroundTransContractSign;
	}

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans contract sign, or <code>null</code> if a matching tourism bona ground trans contract sign could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground trans contract sign, or <code>null</code> if a matching tourism bona ground trans contract sign could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign fetchBygetTourismById(
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

		if (result instanceof TourismBonaGroundTransContractSign) {
			TourismBonaGroundTransContractSign
				tourismBonaGroundTransContractSign =
					(TourismBonaGroundTransContractSign)result;

			if (tourismApplicationId !=
					tourismBonaGroundTransContractSign.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSCONTRACTSIGN_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaGroundTransContractSign> list = query.list();

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
								"TourismBonaGroundTransContractSignPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaGroundTransContractSign
						tourismBonaGroundTransContractSign = list.get(0);

					result = tourismBonaGroundTransContractSign;

					cacheResult(tourismBonaGroundTransContractSign);
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
			return (TourismBonaGroundTransContractSign)result;
		}
	}

	/**
	 * Removes the tourism bona ground trans contract sign where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground trans contract sign that was removed
	 */
	@Override
	public TourismBonaGroundTransContractSign removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransContractSignException {

		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaGroundTransContractSign);
	}

	/**
	 * Returns the number of tourism bona ground trans contract signs where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground trans contract signs
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDTRANSCONTRACTSIGN_WHERE);

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
			"tourismBonaGroundTransContractSign.tourismApplicationId = ?";

	public TourismBonaGroundTransContractSignPersistenceImpl() {
		setModelClass(TourismBonaGroundTransContractSign.class);

		setModelImplClass(TourismBonaGroundTransContractSignImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaGroundTransContractSignTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona ground trans contract sign in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransContractSign the tourism bona ground trans contract sign
	 */
	@Override
	public void cacheResult(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		entityCache.putResult(
			TourismBonaGroundTransContractSignImpl.class,
			tourismBonaGroundTransContractSign.getPrimaryKey(),
			tourismBonaGroundTransContractSign);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaGroundTransContractSign.getTourismApplicationId()
			},
			tourismBonaGroundTransContractSign);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona ground trans contract signs in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransContractSigns the tourism bona ground trans contract signs
	 */
	@Override
	public void cacheResult(
		List<TourismBonaGroundTransContractSign>
			tourismBonaGroundTransContractSigns) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaGroundTransContractSigns.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaGroundTransContractSign
				tourismBonaGroundTransContractSign :
					tourismBonaGroundTransContractSigns) {

			if (entityCache.getResult(
					TourismBonaGroundTransContractSignImpl.class,
					tourismBonaGroundTransContractSign.getPrimaryKey()) ==
						null) {

				cacheResult(tourismBonaGroundTransContractSign);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona ground trans contract signs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaGroundTransContractSignImpl.class);

		finderCache.clearCache(TourismBonaGroundTransContractSignImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona ground trans contract sign.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		entityCache.removeResult(
			TourismBonaGroundTransContractSignImpl.class,
			tourismBonaGroundTransContractSign);
	}

	@Override
	public void clearCache(
		List<TourismBonaGroundTransContractSign>
			tourismBonaGroundTransContractSigns) {

		for (TourismBonaGroundTransContractSign
				tourismBonaGroundTransContractSign :
					tourismBonaGroundTransContractSigns) {

			entityCache.removeResult(
				TourismBonaGroundTransContractSignImpl.class,
				tourismBonaGroundTransContractSign);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaGroundTransContractSignImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaGroundTransContractSignImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaGroundTransContractSignModelImpl
			tourismBonaGroundTransContractSignModelImpl) {

		Object[] args = new Object[] {
			tourismBonaGroundTransContractSignModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaGroundTransContractSignModelImpl);
	}

	/**
	 * Creates a new tourism bona ground trans contract sign with the primary key. Does not add the tourism bona ground trans contract sign to the database.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key for the new tourism bona ground trans contract sign
	 * @return the new tourism bona ground trans contract sign
	 */
	@Override
	public TourismBonaGroundTransContractSign create(
		long tourismBonaGroTraCoSignId) {

		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign =
			new TourismBonaGroundTransContractSignImpl();

		tourismBonaGroundTransContractSign.setNew(true);
		tourismBonaGroundTransContractSign.setPrimaryKey(
			tourismBonaGroTraCoSignId);

		tourismBonaGroundTransContractSign.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaGroundTransContractSign;
	}

	/**
	 * Removes the tourism bona ground trans contract sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was removed
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign remove(
			long tourismBonaGroTraCoSignId)
		throws NoSuchTourismBonaGroundTransContractSignException {

		return remove((Serializable)tourismBonaGroTraCoSignId);
	}

	/**
	 * Removes the tourism bona ground trans contract sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was removed
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign remove(Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransContractSignException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundTransContractSign
				tourismBonaGroundTransContractSign =
					(TourismBonaGroundTransContractSign)session.get(
						TourismBonaGroundTransContractSignImpl.class,
						primaryKey);

			if (tourismBonaGroundTransContractSign == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaGroundTransContractSignException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaGroundTransContractSign);
		}
		catch (NoSuchTourismBonaGroundTransContractSignException
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
	protected TourismBonaGroundTransContractSign removeImpl(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaGroundTransContractSign)) {
				tourismBonaGroundTransContractSign =
					(TourismBonaGroundTransContractSign)session.get(
						TourismBonaGroundTransContractSignImpl.class,
						tourismBonaGroundTransContractSign.getPrimaryKeyObj());
			}

			if (tourismBonaGroundTransContractSign != null) {
				session.delete(tourismBonaGroundTransContractSign);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaGroundTransContractSign != null) {
			clearCache(tourismBonaGroundTransContractSign);
		}

		return tourismBonaGroundTransContractSign;
	}

	@Override
	public TourismBonaGroundTransContractSign updateImpl(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		boolean isNew = tourismBonaGroundTransContractSign.isNew();

		if (!(tourismBonaGroundTransContractSign instanceof
				TourismBonaGroundTransContractSignModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaGroundTransContractSign.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaGroundTransContractSign);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaGroundTransContractSign proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaGroundTransContractSign implementation " +
					tourismBonaGroundTransContractSign.getClass());
		}

		TourismBonaGroundTransContractSignModelImpl
			tourismBonaGroundTransContractSignModelImpl =
				(TourismBonaGroundTransContractSignModelImpl)
					tourismBonaGroundTransContractSign;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaGroundTransContractSign.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaGroundTransContractSign.setCreateDate(date);
			}
			else {
				tourismBonaGroundTransContractSign.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaGroundTransContractSignModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaGroundTransContractSign.setModifiedDate(date);
			}
			else {
				tourismBonaGroundTransContractSign.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaGroundTransContractSign);
			}
			else {
				tourismBonaGroundTransContractSign =
					(TourismBonaGroundTransContractSign)session.merge(
						tourismBonaGroundTransContractSign);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaGroundTransContractSignImpl.class,
			tourismBonaGroundTransContractSignModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaGroundTransContractSignModelImpl);

		if (isNew) {
			tourismBonaGroundTransContractSign.setNew(false);
		}

		tourismBonaGroundTransContractSign.resetOriginalValues();

		return tourismBonaGroundTransContractSign;
	}

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransContractSignException {

		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaGroundTransContractSign == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaGroundTransContractSignException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaGroundTransContractSign;
	}

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or throws a <code>NoSuchTourismBonaGroundTransContractSignException</code> if it could not be found.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign findByPrimaryKey(
			long tourismBonaGroTraCoSignId)
		throws NoSuchTourismBonaGroundTransContractSignException {

		return findByPrimaryKey((Serializable)tourismBonaGroTraCoSignId);
	}

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign, or <code>null</code> if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransContractSign fetchByPrimaryKey(
		long tourismBonaGroTraCoSignId) {

		return fetchByPrimaryKey((Serializable)tourismBonaGroTraCoSignId);
	}

	/**
	 * Returns all the tourism bona ground trans contract signs.
	 *
	 * @return the tourism bona ground trans contract signs
	 */
	@Override
	public List<TourismBonaGroundTransContractSign> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @return the range of tourism bona ground trans contract signs
	 */
	@Override
	public List<TourismBonaGroundTransContractSign> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground trans contract signs
	 */
	@Override
	public List<TourismBonaGroundTransContractSign> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransContractSign>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground trans contract signs
	 */
	@Override
	public List<TourismBonaGroundTransContractSign> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransContractSign> orderByComparator,
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

		List<TourismBonaGroundTransContractSign> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaGroundTransContractSign>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSCONTRACTSIGN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAGROUNDTRANSCONTRACTSIGN;

				sql = sql.concat(
					TourismBonaGroundTransContractSignModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaGroundTransContractSign>)QueryUtil.list(
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
	 * Removes all the tourism bona ground trans contract signs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaGroundTransContractSign
				tourismBonaGroundTransContractSign : findAll()) {

			remove(tourismBonaGroundTransContractSign);
		}
	}

	/**
	 * Returns the number of tourism bona ground trans contract signs.
	 *
	 * @return the number of tourism bona ground trans contract signs
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
					_SQL_COUNT_TOURISMBONAGROUNDTRANSCONTRACTSIGN);

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
		return "tourismBonaGroTraCoSignId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAGROUNDTRANSCONTRACTSIGN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaGroundTransContractSignModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona ground trans contract sign persistence.
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

		TourismBonaGroundTransContractSignUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaGroundTransContractSignUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaGroundTransContractSignImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAGROUNDTRANSCONTRACTSIGN =
		"SELECT tourismBonaGroundTransContractSign FROM TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign";

	private static final String
		_SQL_SELECT_TOURISMBONAGROUNDTRANSCONTRACTSIGN_WHERE =
			"SELECT tourismBonaGroundTransContractSign FROM TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAGROUNDTRANSCONTRACTSIGN =
		"SELECT COUNT(tourismBonaGroundTransContractSign) FROM TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign";

	private static final String
		_SQL_COUNT_TOURISMBONAGROUNDTRANSCONTRACTSIGN_WHERE =
			"SELECT COUNT(tourismBonaGroundTransContractSign) FROM TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaGroundTransContractSign.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaGroundTransContractSign exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaGroundTransContractSign exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaGroundTransContractSignPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}