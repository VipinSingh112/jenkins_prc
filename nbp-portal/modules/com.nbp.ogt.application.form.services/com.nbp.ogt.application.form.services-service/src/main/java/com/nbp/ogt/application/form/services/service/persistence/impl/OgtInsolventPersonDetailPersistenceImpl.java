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

import com.nbp.ogt.application.form.services.exception.NoSuchOgtInsolventPersonDetailException;
import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;
import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetailTable;
import com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailImpl;
import com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OgtInsolventPersonDetailPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtInsolventPersonDetailUtil;
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
 * The persistence implementation for the ogt insolvent person detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtInsolventPersonDetailPersistence.class)
public class OgtInsolventPersonDetailPersistenceImpl
	extends BasePersistenceImpl<OgtInsolventPersonDetail>
	implements OgtInsolventPersonDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtInsolventPersonDetailUtil</code> to access the ogt insolvent person detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtInsolventPersonDetailImpl.class.getName();

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
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or throws a <code>NoSuchOgtInsolventPersonDetailException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a matching ogt insolvent person detail could not be found
	 */
	@Override
	public OgtInsolventPersonDetail findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtInsolventPersonDetailException {

		OgtInsolventPersonDetail ogtInsolventPersonDetail = fetchBygetOgtById(
			ogtApplicationId);

		if (ogtInsolventPersonDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtInsolventPersonDetailException(sb.toString());
		}

		return ogtInsolventPersonDetail;
	}

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt insolvent person detail, or <code>null</code> if a matching ogt insolvent person detail could not be found
	 */
	@Override
	public OgtInsolventPersonDetail fetchBygetOgtById(long ogtApplicationId) {
		return fetchBygetOgtById(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt insolvent person detail, or <code>null</code> if a matching ogt insolvent person detail could not be found
	 */
	@Override
	public OgtInsolventPersonDetail fetchBygetOgtById(
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

		if (result instanceof OgtInsolventPersonDetail) {
			OgtInsolventPersonDetail ogtInsolventPersonDetail =
				(OgtInsolventPersonDetail)result;

			if (ogtApplicationId !=
					ogtInsolventPersonDetail.getOgtApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTINSOLVENTPERSONDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OgtInsolventPersonDetail> list = query.list();

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
								"OgtInsolventPersonDetailPersistenceImpl.fetchBygetOgtById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtInsolventPersonDetail ogtInsolventPersonDetail =
						list.get(0);

					result = ogtInsolventPersonDetail;

					cacheResult(ogtInsolventPersonDetail);
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
			return (OgtInsolventPersonDetail)result;
		}
	}

	/**
	 * Removes the ogt insolvent person detail where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt insolvent person detail that was removed
	 */
	@Override
	public OgtInsolventPersonDetail removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtInsolventPersonDetailException {

		OgtInsolventPersonDetail ogtInsolventPersonDetail = findBygetOgtById(
			ogtApplicationId);

		return remove(ogtInsolventPersonDetail);
	}

	/**
	 * Returns the number of ogt insolvent person details where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt insolvent person details
	 */
	@Override
	public int countBygetOgtById(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOgtById;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTINSOLVENTPERSONDETAIL_WHERE);

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
		"ogtInsolventPersonDetail.ogtApplicationId = ?";

	public OgtInsolventPersonDetailPersistenceImpl() {
		setModelClass(OgtInsolventPersonDetail.class);

		setModelImplClass(OgtInsolventPersonDetailImpl.class);
		setModelPKClass(long.class);

		setTable(OgtInsolventPersonDetailTable.INSTANCE);
	}

	/**
	 * Caches the ogt insolvent person detail in the entity cache if it is enabled.
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 */
	@Override
	public void cacheResult(OgtInsolventPersonDetail ogtInsolventPersonDetail) {
		entityCache.putResult(
			OgtInsolventPersonDetailImpl.class,
			ogtInsolventPersonDetail.getPrimaryKey(), ogtInsolventPersonDetail);

		finderCache.putResult(
			_finderPathFetchBygetOgtById,
			new Object[] {ogtInsolventPersonDetail.getOgtApplicationId()},
			ogtInsolventPersonDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt insolvent person details in the entity cache if it is enabled.
	 *
	 * @param ogtInsolventPersonDetails the ogt insolvent person details
	 */
	@Override
	public void cacheResult(
		List<OgtInsolventPersonDetail> ogtInsolventPersonDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtInsolventPersonDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtInsolventPersonDetail ogtInsolventPersonDetail :
				ogtInsolventPersonDetails) {

			if (entityCache.getResult(
					OgtInsolventPersonDetailImpl.class,
					ogtInsolventPersonDetail.getPrimaryKey()) == null) {

				cacheResult(ogtInsolventPersonDetail);
			}
		}
	}

	/**
	 * Clears the cache for all ogt insolvent person details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtInsolventPersonDetailImpl.class);

		finderCache.clearCache(OgtInsolventPersonDetailImpl.class);
	}

	/**
	 * Clears the cache for the ogt insolvent person detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtInsolventPersonDetail ogtInsolventPersonDetail) {
		entityCache.removeResult(
			OgtInsolventPersonDetailImpl.class, ogtInsolventPersonDetail);
	}

	@Override
	public void clearCache(
		List<OgtInsolventPersonDetail> ogtInsolventPersonDetails) {

		for (OgtInsolventPersonDetail ogtInsolventPersonDetail :
				ogtInsolventPersonDetails) {

			entityCache.removeResult(
				OgtInsolventPersonDetailImpl.class, ogtInsolventPersonDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtInsolventPersonDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OgtInsolventPersonDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtInsolventPersonDetailModelImpl ogtInsolventPersonDetailModelImpl) {

		Object[] args = new Object[] {
			ogtInsolventPersonDetailModelImpl.getOgtApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtById, args,
			ogtInsolventPersonDetailModelImpl);
	}

	/**
	 * Creates a new ogt insolvent person detail with the primary key. Does not add the ogt insolvent person detail to the database.
	 *
	 * @param ogtInsolventPersonDetailId the primary key for the new ogt insolvent person detail
	 * @return the new ogt insolvent person detail
	 */
	@Override
	public OgtInsolventPersonDetail create(long ogtInsolventPersonDetailId) {
		OgtInsolventPersonDetail ogtInsolventPersonDetail =
			new OgtInsolventPersonDetailImpl();

		ogtInsolventPersonDetail.setNew(true);
		ogtInsolventPersonDetail.setPrimaryKey(ogtInsolventPersonDetailId);

		ogtInsolventPersonDetail.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return ogtInsolventPersonDetail;
	}

	/**
	 * Removes the ogt insolvent person detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public OgtInsolventPersonDetail remove(long ogtInsolventPersonDetailId)
		throws NoSuchOgtInsolventPersonDetailException {

		return remove((Serializable)ogtInsolventPersonDetailId);
	}

	/**
	 * Removes the ogt insolvent person detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public OgtInsolventPersonDetail remove(Serializable primaryKey)
		throws NoSuchOgtInsolventPersonDetailException {

		Session session = null;

		try {
			session = openSession();

			OgtInsolventPersonDetail ogtInsolventPersonDetail =
				(OgtInsolventPersonDetail)session.get(
					OgtInsolventPersonDetailImpl.class, primaryKey);

			if (ogtInsolventPersonDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtInsolventPersonDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtInsolventPersonDetail);
		}
		catch (NoSuchOgtInsolventPersonDetailException noSuchEntityException) {
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
	protected OgtInsolventPersonDetail removeImpl(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtInsolventPersonDetail)) {
				ogtInsolventPersonDetail =
					(OgtInsolventPersonDetail)session.get(
						OgtInsolventPersonDetailImpl.class,
						ogtInsolventPersonDetail.getPrimaryKeyObj());
			}

			if (ogtInsolventPersonDetail != null) {
				session.delete(ogtInsolventPersonDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtInsolventPersonDetail != null) {
			clearCache(ogtInsolventPersonDetail);
		}

		return ogtInsolventPersonDetail;
	}

	@Override
	public OgtInsolventPersonDetail updateImpl(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		boolean isNew = ogtInsolventPersonDetail.isNew();

		if (!(ogtInsolventPersonDetail instanceof
				OgtInsolventPersonDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtInsolventPersonDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtInsolventPersonDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtInsolventPersonDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtInsolventPersonDetail implementation " +
					ogtInsolventPersonDetail.getClass());
		}

		OgtInsolventPersonDetailModelImpl ogtInsolventPersonDetailModelImpl =
			(OgtInsolventPersonDetailModelImpl)ogtInsolventPersonDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtInsolventPersonDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtInsolventPersonDetail.setCreateDate(date);
			}
			else {
				ogtInsolventPersonDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtInsolventPersonDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtInsolventPersonDetail.setModifiedDate(date);
			}
			else {
				ogtInsolventPersonDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtInsolventPersonDetail);
			}
			else {
				ogtInsolventPersonDetail =
					(OgtInsolventPersonDetail)session.merge(
						ogtInsolventPersonDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtInsolventPersonDetailImpl.class,
			ogtInsolventPersonDetailModelImpl, false, true);

		cacheUniqueFindersCache(ogtInsolventPersonDetailModelImpl);

		if (isNew) {
			ogtInsolventPersonDetail.setNew(false);
		}

		ogtInsolventPersonDetail.resetOriginalValues();

		return ogtInsolventPersonDetail;
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public OgtInsolventPersonDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtInsolventPersonDetailException {

		OgtInsolventPersonDetail ogtInsolventPersonDetail = fetchByPrimaryKey(
			primaryKey);

		if (ogtInsolventPersonDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtInsolventPersonDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtInsolventPersonDetail;
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key or throws a <code>NoSuchOgtInsolventPersonDetailException</code> if it could not be found.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public OgtInsolventPersonDetail findByPrimaryKey(
			long ogtInsolventPersonDetailId)
		throws NoSuchOgtInsolventPersonDetailException {

		return findByPrimaryKey((Serializable)ogtInsolventPersonDetailId);
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail, or <code>null</code> if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public OgtInsolventPersonDetail fetchByPrimaryKey(
		long ogtInsolventPersonDetailId) {

		return fetchByPrimaryKey((Serializable)ogtInsolventPersonDetailId);
	}

	/**
	 * Returns all the ogt insolvent person details.
	 *
	 * @return the ogt insolvent person details
	 */
	@Override
	public List<OgtInsolventPersonDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @return the range of ogt insolvent person details
	 */
	@Override
	public List<OgtInsolventPersonDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt insolvent person details
	 */
	@Override
	public List<OgtInsolventPersonDetail> findAll(
		int start, int end,
		OrderByComparator<OgtInsolventPersonDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt insolvent person details
	 */
	@Override
	public List<OgtInsolventPersonDetail> findAll(
		int start, int end,
		OrderByComparator<OgtInsolventPersonDetail> orderByComparator,
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

		List<OgtInsolventPersonDetail> list = null;

		if (useFinderCache) {
			list = (List<OgtInsolventPersonDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTINSOLVENTPERSONDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTINSOLVENTPERSONDETAIL;

				sql = sql.concat(
					OgtInsolventPersonDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtInsolventPersonDetail>)QueryUtil.list(
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
	 * Removes all the ogt insolvent person details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtInsolventPersonDetail ogtInsolventPersonDetail : findAll()) {
			remove(ogtInsolventPersonDetail);
		}
	}

	/**
	 * Returns the number of ogt insolvent person details.
	 *
	 * @return the number of ogt insolvent person details
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
					_SQL_COUNT_OGTINSOLVENTPERSONDETAIL);

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
		return "ogtInsolventPersonDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTINSOLVENTPERSONDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtInsolventPersonDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt insolvent person detail persistence.
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

		OgtInsolventPersonDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtInsolventPersonDetailUtil.setPersistence(null);

		entityCache.removeCache(OgtInsolventPersonDetailImpl.class.getName());
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

	private static final String _SQL_SELECT_OGTINSOLVENTPERSONDETAIL =
		"SELECT ogtInsolventPersonDetail FROM OgtInsolventPersonDetail ogtInsolventPersonDetail";

	private static final String _SQL_SELECT_OGTINSOLVENTPERSONDETAIL_WHERE =
		"SELECT ogtInsolventPersonDetail FROM OgtInsolventPersonDetail ogtInsolventPersonDetail WHERE ";

	private static final String _SQL_COUNT_OGTINSOLVENTPERSONDETAIL =
		"SELECT COUNT(ogtInsolventPersonDetail) FROM OgtInsolventPersonDetail ogtInsolventPersonDetail";

	private static final String _SQL_COUNT_OGTINSOLVENTPERSONDETAIL_WHERE =
		"SELECT COUNT(ogtInsolventPersonDetail) FROM OgtInsolventPersonDetail ogtInsolventPersonDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ogtInsolventPersonDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtInsolventPersonDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtInsolventPersonDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtInsolventPersonDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}