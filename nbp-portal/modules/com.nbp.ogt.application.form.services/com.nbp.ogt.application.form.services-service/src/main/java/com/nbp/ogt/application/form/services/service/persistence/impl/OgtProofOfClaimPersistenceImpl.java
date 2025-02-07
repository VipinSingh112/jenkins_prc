/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence.impl;

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

import com.nbp.ogt.application.form.services.exception.NoSuchOgtProofOfClaimException;
import com.nbp.ogt.application.form.services.model.OgtProofOfClaim;
import com.nbp.ogt.application.form.services.model.OgtProofOfClaimTable;
import com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimImpl;
import com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OgtProofOfClaimPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtProofOfClaimUtil;
import com.nbp.ogt.application.form.services.service.persistence.impl.constants.OGT_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ogt proof of claim service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtProofOfClaimPersistence.class)
public class OgtProofOfClaimPersistenceImpl
	extends BasePersistenceImpl<OgtProofOfClaim>
	implements OgtProofOfClaimPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtProofOfClaimUtil</code> to access the ogt proof of claim persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtProofOfClaimImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOgtById;
	private FinderPath _finderPathCountBygetOgtById;

	/**
	 * Returns the ogt proof of claim where ogtApplicationId = &#63; or throws a <code>NoSuchOgtProofOfClaimException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt proof of claim
	 * @throws NoSuchOgtProofOfClaimException if a matching ogt proof of claim could not be found
	 */
	@Override
	public OgtProofOfClaim findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtProofOfClaimException {

		OgtProofOfClaim ogtProofOfClaim = fetchBygetOgtById(ogtApplicationId);

		if (ogtProofOfClaim == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtProofOfClaimException(sb.toString());
		}

		return ogtProofOfClaim;
	}

	/**
	 * Returns the ogt proof of claim where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt proof of claim, or <code>null</code> if a matching ogt proof of claim could not be found
	 */
	@Override
	public OgtProofOfClaim fetchBygetOgtById(long ogtApplicationId) {
		return fetchBygetOgtById(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt proof of claim where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt proof of claim, or <code>null</code> if a matching ogt proof of claim could not be found
	 */
	@Override
	public OgtProofOfClaim fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ogtApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtById, finderArgs, this);
		}

		if (result instanceof OgtProofOfClaim) {
			OgtProofOfClaim ogtProofOfClaim = (OgtProofOfClaim)result;

			if (ogtApplicationId != ogtProofOfClaim.getOgtApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTPROOFOFCLAIM_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OgtProofOfClaim> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ogtApplicationId};
							}

							_log.warn(
								"OgtProofOfClaimPersistenceImpl.fetchBygetOgtById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtProofOfClaim ogtProofOfClaim = list.get(0);

					result = ogtProofOfClaim;

					cacheResult(ogtProofOfClaim);
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
			return (OgtProofOfClaim)result;
		}
	}

	/**
	 * Removes the ogt proof of claim where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt proof of claim that was removed
	 */
	@Override
	public OgtProofOfClaim removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtProofOfClaimException {

		OgtProofOfClaim ogtProofOfClaim = findBygetOgtById(ogtApplicationId);

		return remove(ogtProofOfClaim);
	}

	/**
	 * Returns the number of ogt proof of claims where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt proof of claims
	 */
	@Override
	public int countBygetOgtById(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOgtById;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTPROOFOFCLAIM_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

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

	private static final String _FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2 =
		"ogtProofOfClaim.ogtApplicationId = ?";

	public OgtProofOfClaimPersistenceImpl() {
		setModelClass(OgtProofOfClaim.class);

		setModelImplClass(OgtProofOfClaimImpl.class);
		setModelPKClass(long.class);

		setTable(OgtProofOfClaimTable.INSTANCE);
	}

	/**
	 * Caches the ogt proof of claim in the entity cache if it is enabled.
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 */
	@Override
	public void cacheResult(OgtProofOfClaim ogtProofOfClaim) {
		entityCache.putResult(
			OgtProofOfClaimImpl.class, ogtProofOfClaim.getPrimaryKey(),
			ogtProofOfClaim);

		finderCache.putResult(
			_finderPathFetchBygetOgtById,
			new Object[] {ogtProofOfClaim.getOgtApplicationId()},
			ogtProofOfClaim);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt proof of claims in the entity cache if it is enabled.
	 *
	 * @param ogtProofOfClaims the ogt proof of claims
	 */
	@Override
	public void cacheResult(List<OgtProofOfClaim> ogtProofOfClaims) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtProofOfClaims.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtProofOfClaim ogtProofOfClaim : ogtProofOfClaims) {
			if (entityCache.getResult(
					OgtProofOfClaimImpl.class,
					ogtProofOfClaim.getPrimaryKey()) == null) {

				cacheResult(ogtProofOfClaim);
			}
		}
	}

	/**
	 * Clears the cache for all ogt proof of claims.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtProofOfClaimImpl.class);

		finderCache.clearCache(OgtProofOfClaimImpl.class);
	}

	/**
	 * Clears the cache for the ogt proof of claim.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtProofOfClaim ogtProofOfClaim) {
		entityCache.removeResult(OgtProofOfClaimImpl.class, ogtProofOfClaim);
	}

	@Override
	public void clearCache(List<OgtProofOfClaim> ogtProofOfClaims) {
		for (OgtProofOfClaim ogtProofOfClaim : ogtProofOfClaims) {
			entityCache.removeResult(
				OgtProofOfClaimImpl.class, ogtProofOfClaim);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtProofOfClaimImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OgtProofOfClaimImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtProofOfClaimModelImpl ogtProofOfClaimModelImpl) {

		Object[] args = new Object[] {
			ogtProofOfClaimModelImpl.getOgtApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtById, args, ogtProofOfClaimModelImpl);
	}

	/**
	 * Creates a new ogt proof of claim with the primary key. Does not add the ogt proof of claim to the database.
	 *
	 * @param ogtProofOfClaimId the primary key for the new ogt proof of claim
	 * @return the new ogt proof of claim
	 */
	@Override
	public OgtProofOfClaim create(long ogtProofOfClaimId) {
		OgtProofOfClaim ogtProofOfClaim = new OgtProofOfClaimImpl();

		ogtProofOfClaim.setNew(true);
		ogtProofOfClaim.setPrimaryKey(ogtProofOfClaimId);

		ogtProofOfClaim.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtProofOfClaim;
	}

	/**
	 * Removes the ogt proof of claim with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 * @throws NoSuchOgtProofOfClaimException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public OgtProofOfClaim remove(long ogtProofOfClaimId)
		throws NoSuchOgtProofOfClaimException {

		return remove((Serializable)ogtProofOfClaimId);
	}

	/**
	 * Removes the ogt proof of claim with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 * @throws NoSuchOgtProofOfClaimException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public OgtProofOfClaim remove(Serializable primaryKey)
		throws NoSuchOgtProofOfClaimException {

		Session session = null;

		try {
			session = openSession();

			OgtProofOfClaim ogtProofOfClaim = (OgtProofOfClaim)session.get(
				OgtProofOfClaimImpl.class, primaryKey);

			if (ogtProofOfClaim == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtProofOfClaimException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtProofOfClaim);
		}
		catch (NoSuchOgtProofOfClaimException noSuchEntityException) {
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
	protected OgtProofOfClaim removeImpl(OgtProofOfClaim ogtProofOfClaim) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtProofOfClaim)) {
				ogtProofOfClaim = (OgtProofOfClaim)session.get(
					OgtProofOfClaimImpl.class,
					ogtProofOfClaim.getPrimaryKeyObj());
			}

			if (ogtProofOfClaim != null) {
				session.delete(ogtProofOfClaim);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtProofOfClaim != null) {
			clearCache(ogtProofOfClaim);
		}

		return ogtProofOfClaim;
	}

	@Override
	public OgtProofOfClaim updateImpl(OgtProofOfClaim ogtProofOfClaim) {
		boolean isNew = ogtProofOfClaim.isNew();

		if (!(ogtProofOfClaim instanceof OgtProofOfClaimModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtProofOfClaim.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtProofOfClaim);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtProofOfClaim proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtProofOfClaim implementation " +
					ogtProofOfClaim.getClass());
		}

		OgtProofOfClaimModelImpl ogtProofOfClaimModelImpl =
			(OgtProofOfClaimModelImpl)ogtProofOfClaim;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtProofOfClaim.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtProofOfClaim.setCreateDate(date);
			}
			else {
				ogtProofOfClaim.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtProofOfClaimModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtProofOfClaim.setModifiedDate(date);
			}
			else {
				ogtProofOfClaim.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtProofOfClaim);
			}
			else {
				ogtProofOfClaim = (OgtProofOfClaim)session.merge(
					ogtProofOfClaim);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtProofOfClaimImpl.class, ogtProofOfClaimModelImpl, false, true);

		cacheUniqueFindersCache(ogtProofOfClaimModelImpl);

		if (isNew) {
			ogtProofOfClaim.setNew(false);
		}

		ogtProofOfClaim.resetOriginalValues();

		return ogtProofOfClaim;
	}

	/**
	 * Returns the ogt proof of claim with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt proof of claim
	 * @return the ogt proof of claim
	 * @throws NoSuchOgtProofOfClaimException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public OgtProofOfClaim findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtProofOfClaimException {

		OgtProofOfClaim ogtProofOfClaim = fetchByPrimaryKey(primaryKey);

		if (ogtProofOfClaim == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtProofOfClaimException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtProofOfClaim;
	}

	/**
	 * Returns the ogt proof of claim with the primary key or throws a <code>NoSuchOgtProofOfClaimException</code> if it could not be found.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim
	 * @throws NoSuchOgtProofOfClaimException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public OgtProofOfClaim findByPrimaryKey(long ogtProofOfClaimId)
		throws NoSuchOgtProofOfClaimException {

		return findByPrimaryKey((Serializable)ogtProofOfClaimId);
	}

	/**
	 * Returns the ogt proof of claim with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim, or <code>null</code> if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public OgtProofOfClaim fetchByPrimaryKey(long ogtProofOfClaimId) {
		return fetchByPrimaryKey((Serializable)ogtProofOfClaimId);
	}

	/**
	 * Returns all the ogt proof of claims.
	 *
	 * @return the ogt proof of claims
	 */
	@Override
	public List<OgtProofOfClaim> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @return the range of ogt proof of claims
	 */
	@Override
	public List<OgtProofOfClaim> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt proof of claims
	 */
	@Override
	public List<OgtProofOfClaim> findAll(
		int start, int end,
		OrderByComparator<OgtProofOfClaim> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt proof of claims
	 */
	@Override
	public List<OgtProofOfClaim> findAll(
		int start, int end,
		OrderByComparator<OgtProofOfClaim> orderByComparator,
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

		List<OgtProofOfClaim> list = null;

		if (useFinderCache) {
			list = (List<OgtProofOfClaim>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTPROOFOFCLAIM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTPROOFOFCLAIM;

				sql = sql.concat(OgtProofOfClaimModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtProofOfClaim>)QueryUtil.list(
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
	 * Removes all the ogt proof of claims from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtProofOfClaim ogtProofOfClaim : findAll()) {
			remove(ogtProofOfClaim);
		}
	}

	/**
	 * Returns the number of ogt proof of claims.
	 *
	 * @return the number of ogt proof of claims
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OGTPROOFOFCLAIM);

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
		return "ogtProofOfClaimId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTPROOFOFCLAIM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtProofOfClaimModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt proof of claim persistence.
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

		_finderPathFetchBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, true);

		_finderPathCountBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, false);

		OgtProofOfClaimUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtProofOfClaimUtil.setPersistence(null);

		entityCache.removeCache(OgtProofOfClaimImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTPROOFOFCLAIM =
		"SELECT ogtProofOfClaim FROM OgtProofOfClaim ogtProofOfClaim";

	private static final String _SQL_SELECT_OGTPROOFOFCLAIM_WHERE =
		"SELECT ogtProofOfClaim FROM OgtProofOfClaim ogtProofOfClaim WHERE ";

	private static final String _SQL_COUNT_OGTPROOFOFCLAIM =
		"SELECT COUNT(ogtProofOfClaim) FROM OgtProofOfClaim ogtProofOfClaim";

	private static final String _SQL_COUNT_OGTPROOFOFCLAIM_WHERE =
		"SELECT COUNT(ogtProofOfClaim) FROM OgtProofOfClaim ogtProofOfClaim WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtProofOfClaim.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtProofOfClaim exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtProofOfClaim exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtProofOfClaimPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}