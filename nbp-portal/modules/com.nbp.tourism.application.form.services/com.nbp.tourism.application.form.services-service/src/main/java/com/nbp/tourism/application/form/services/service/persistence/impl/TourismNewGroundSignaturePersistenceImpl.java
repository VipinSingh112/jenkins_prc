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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewGroundSignatureException;
import com.nbp.tourism.application.form.services.model.TourismNewGroundSignature;
import com.nbp.tourism.application.form.services.model.TourismNewGroundSignatureTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewGroundSignatureImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewGroundSignatureModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewGroundSignaturePersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewGroundSignatureUtil;
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
 * The persistence implementation for the tourism new ground signature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewGroundSignaturePersistence.class)
public class TourismNewGroundSignaturePersistenceImpl
	extends BasePersistenceImpl<TourismNewGroundSignature>
	implements TourismNewGroundSignaturePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewGroundSignatureUtil</code> to access the tourism new ground signature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewGroundSignatureImpl.class.getName();

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
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewGroundSignatureException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a matching tourism new ground signature could not be found
	 */
	@Override
	public TourismNewGroundSignature findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewGroundSignatureException {

		TourismNewGroundSignature tourismNewGroundSignature =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewGroundSignature == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewGroundSignatureException(sb.toString());
		}

		return tourismNewGroundSignature;
	}

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground signature, or <code>null</code> if a matching tourism new ground signature could not be found
	 */
	@Override
	public TourismNewGroundSignature fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new ground signature, or <code>null</code> if a matching tourism new ground signature could not be found
	 */
	@Override
	public TourismNewGroundSignature fetchBygetTourismById(
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

		if (result instanceof TourismNewGroundSignature) {
			TourismNewGroundSignature tourismNewGroundSignature =
				(TourismNewGroundSignature)result;

			if (tourismApplicationId !=
					tourismNewGroundSignature.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWGROUNDSIGNATURE_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewGroundSignature> list = query.list();

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
								"TourismNewGroundSignaturePersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewGroundSignature tourismNewGroundSignature =
						list.get(0);

					result = tourismNewGroundSignature;

					cacheResult(tourismNewGroundSignature);
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
			return (TourismNewGroundSignature)result;
		}
	}

	/**
	 * Removes the tourism new ground signature where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new ground signature that was removed
	 */
	@Override
	public TourismNewGroundSignature removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewGroundSignatureException {

		TourismNewGroundSignature tourismNewGroundSignature =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewGroundSignature);
	}

	/**
	 * Returns the number of tourism new ground signatures where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new ground signatures
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWGROUNDSIGNATURE_WHERE);

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
			"tourismNewGroundSignature.tourismApplicationId = ?";

	public TourismNewGroundSignaturePersistenceImpl() {
		setModelClass(TourismNewGroundSignature.class);

		setModelImplClass(TourismNewGroundSignatureImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewGroundSignatureTable.INSTANCE);
	}

	/**
	 * Caches the tourism new ground signature in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundSignature the tourism new ground signature
	 */
	@Override
	public void cacheResult(
		TourismNewGroundSignature tourismNewGroundSignature) {

		entityCache.putResult(
			TourismNewGroundSignatureImpl.class,
			tourismNewGroundSignature.getPrimaryKey(),
			tourismNewGroundSignature);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismNewGroundSignature.getTourismApplicationId()},
			tourismNewGroundSignature);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new ground signatures in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundSignatures the tourism new ground signatures
	 */
	@Override
	public void cacheResult(
		List<TourismNewGroundSignature> tourismNewGroundSignatures) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewGroundSignatures.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewGroundSignature tourismNewGroundSignature :
				tourismNewGroundSignatures) {

			if (entityCache.getResult(
					TourismNewGroundSignatureImpl.class,
					tourismNewGroundSignature.getPrimaryKey()) == null) {

				cacheResult(tourismNewGroundSignature);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new ground signatures.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewGroundSignatureImpl.class);

		finderCache.clearCache(TourismNewGroundSignatureImpl.class);
	}

	/**
	 * Clears the cache for the tourism new ground signature.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewGroundSignature tourismNewGroundSignature) {

		entityCache.removeResult(
			TourismNewGroundSignatureImpl.class, tourismNewGroundSignature);
	}

	@Override
	public void clearCache(
		List<TourismNewGroundSignature> tourismNewGroundSignatures) {

		for (TourismNewGroundSignature tourismNewGroundSignature :
				tourismNewGroundSignatures) {

			entityCache.removeResult(
				TourismNewGroundSignatureImpl.class, tourismNewGroundSignature);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewGroundSignatureImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewGroundSignatureImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewGroundSignatureModelImpl tourismNewGroundSignatureModelImpl) {

		Object[] args = new Object[] {
			tourismNewGroundSignatureModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewGroundSignatureModelImpl);
	}

	/**
	 * Creates a new tourism new ground signature with the primary key. Does not add the tourism new ground signature to the database.
	 *
	 * @param TourismNewGroundSignatureId the primary key for the new tourism new ground signature
	 * @return the new tourism new ground signature
	 */
	@Override
	public TourismNewGroundSignature create(long TourismNewGroundSignatureId) {
		TourismNewGroundSignature tourismNewGroundSignature =
			new TourismNewGroundSignatureImpl();

		tourismNewGroundSignature.setNew(true);
		tourismNewGroundSignature.setPrimaryKey(TourismNewGroundSignatureId);

		tourismNewGroundSignature.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewGroundSignature;
	}

	/**
	 * Removes the tourism new ground signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature that was removed
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public TourismNewGroundSignature remove(long TourismNewGroundSignatureId)
		throws NoSuchTourismNewGroundSignatureException {

		return remove((Serializable)TourismNewGroundSignatureId);
	}

	/**
	 * Removes the tourism new ground signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new ground signature
	 * @return the tourism new ground signature that was removed
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public TourismNewGroundSignature remove(Serializable primaryKey)
		throws NoSuchTourismNewGroundSignatureException {

		Session session = null;

		try {
			session = openSession();

			TourismNewGroundSignature tourismNewGroundSignature =
				(TourismNewGroundSignature)session.get(
					TourismNewGroundSignatureImpl.class, primaryKey);

			if (tourismNewGroundSignature == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewGroundSignatureException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewGroundSignature);
		}
		catch (NoSuchTourismNewGroundSignatureException noSuchEntityException) {
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
	protected TourismNewGroundSignature removeImpl(
		TourismNewGroundSignature tourismNewGroundSignature) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewGroundSignature)) {
				tourismNewGroundSignature =
					(TourismNewGroundSignature)session.get(
						TourismNewGroundSignatureImpl.class,
						tourismNewGroundSignature.getPrimaryKeyObj());
			}

			if (tourismNewGroundSignature != null) {
				session.delete(tourismNewGroundSignature);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewGroundSignature != null) {
			clearCache(tourismNewGroundSignature);
		}

		return tourismNewGroundSignature;
	}

	@Override
	public TourismNewGroundSignature updateImpl(
		TourismNewGroundSignature tourismNewGroundSignature) {

		boolean isNew = tourismNewGroundSignature.isNew();

		if (!(tourismNewGroundSignature instanceof
				TourismNewGroundSignatureModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismNewGroundSignature.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewGroundSignature);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewGroundSignature proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewGroundSignature implementation " +
					tourismNewGroundSignature.getClass());
		}

		TourismNewGroundSignatureModelImpl tourismNewGroundSignatureModelImpl =
			(TourismNewGroundSignatureModelImpl)tourismNewGroundSignature;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewGroundSignature.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewGroundSignature.setCreateDate(date);
			}
			else {
				tourismNewGroundSignature.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewGroundSignatureModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewGroundSignature.setModifiedDate(date);
			}
			else {
				tourismNewGroundSignature.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewGroundSignature);
			}
			else {
				tourismNewGroundSignature =
					(TourismNewGroundSignature)session.merge(
						tourismNewGroundSignature);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewGroundSignatureImpl.class,
			tourismNewGroundSignatureModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewGroundSignatureModelImpl);

		if (isNew) {
			tourismNewGroundSignature.setNew(false);
		}

		tourismNewGroundSignature.resetOriginalValues();

		return tourismNewGroundSignature;
	}

	/**
	 * Returns the tourism new ground signature with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new ground signature
	 * @return the tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public TourismNewGroundSignature findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewGroundSignatureException {

		TourismNewGroundSignature tourismNewGroundSignature = fetchByPrimaryKey(
			primaryKey);

		if (tourismNewGroundSignature == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewGroundSignatureException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewGroundSignature;
	}

	/**
	 * Returns the tourism new ground signature with the primary key or throws a <code>NoSuchTourismNewGroundSignatureException</code> if it could not be found.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public TourismNewGroundSignature findByPrimaryKey(
			long TourismNewGroundSignatureId)
		throws NoSuchTourismNewGroundSignatureException {

		return findByPrimaryKey((Serializable)TourismNewGroundSignatureId);
	}

	/**
	 * Returns the tourism new ground signature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature, or <code>null</code> if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public TourismNewGroundSignature fetchByPrimaryKey(
		long TourismNewGroundSignatureId) {

		return fetchByPrimaryKey((Serializable)TourismNewGroundSignatureId);
	}

	/**
	 * Returns all the tourism new ground signatures.
	 *
	 * @return the tourism new ground signatures
	 */
	@Override
	public List<TourismNewGroundSignature> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @return the range of tourism new ground signatures
	 */
	@Override
	public List<TourismNewGroundSignature> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new ground signatures
	 */
	@Override
	public List<TourismNewGroundSignature> findAll(
		int start, int end,
		OrderByComparator<TourismNewGroundSignature> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new ground signatures
	 */
	@Override
	public List<TourismNewGroundSignature> findAll(
		int start, int end,
		OrderByComparator<TourismNewGroundSignature> orderByComparator,
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

		List<TourismNewGroundSignature> list = null;

		if (useFinderCache) {
			list = (List<TourismNewGroundSignature>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWGROUNDSIGNATURE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWGROUNDSIGNATURE;

				sql = sql.concat(
					TourismNewGroundSignatureModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewGroundSignature>)QueryUtil.list(
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
	 * Removes all the tourism new ground signatures from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewGroundSignature tourismNewGroundSignature : findAll()) {
			remove(tourismNewGroundSignature);
		}
	}

	/**
	 * Returns the number of tourism new ground signatures.
	 *
	 * @return the number of tourism new ground signatures
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
					_SQL_COUNT_TOURISMNEWGROUNDSIGNATURE);

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
		return "TourismNewGroundSignatureId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWGROUNDSIGNATURE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewGroundSignatureModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new ground signature persistence.
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

		TourismNewGroundSignatureUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewGroundSignatureUtil.setPersistence(null);

		entityCache.removeCache(TourismNewGroundSignatureImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWGROUNDSIGNATURE =
		"SELECT tourismNewGroundSignature FROM TourismNewGroundSignature tourismNewGroundSignature";

	private static final String _SQL_SELECT_TOURISMNEWGROUNDSIGNATURE_WHERE =
		"SELECT tourismNewGroundSignature FROM TourismNewGroundSignature tourismNewGroundSignature WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWGROUNDSIGNATURE =
		"SELECT COUNT(tourismNewGroundSignature) FROM TourismNewGroundSignature tourismNewGroundSignature";

	private static final String _SQL_COUNT_TOURISMNEWGROUNDSIGNATURE_WHERE =
		"SELECT COUNT(tourismNewGroundSignature) FROM TourismNewGroundSignature tourismNewGroundSignature WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewGroundSignature.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewGroundSignature exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewGroundSignature exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewGroundSignaturePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}