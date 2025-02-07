/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingRecommendationToJCAException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCATable;
import com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAImpl;
import com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingRecommendationToJCAPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingRecommendationToJCAUtil;
import com.nbp.manufacturing.application.stages.services.service.persistence.impl.constants.MANUFACTURING_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manufacturing recommendation to jca service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManufacturingRecommendationToJCAPersistence.class)
public class ManufacturingRecommendationToJCAPersistenceImpl
	extends BasePersistenceImpl<ManufacturingRecommendationToJCA>
	implements ManufacturingRecommendationToJCAPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManufacturingRecommendationToJCAUtil</code> to access the manufacturing recommendation to jca persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManufacturingRecommendationToJCAImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManuFacturingBy_CaseId;
	private FinderPath _finderPathCountBygetManuFacturingBy_CaseId;

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or throws a <code>NoSuchManufacturingRecommendationToJCAException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a matching manufacturing recommendation to jca could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA findBygetManuFacturingBy_CaseId(
			String caseId)
		throws NoSuchManufacturingRecommendationToJCAException {

		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA =
			fetchBygetManuFacturingBy_CaseId(caseId);

		if (manufacturingRecommendationToJCA == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingRecommendationToJCAException(
				sb.toString());
		}

		return manufacturingRecommendationToJCA;
	}

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing recommendation to jca, or <code>null</code> if a matching manufacturing recommendation to jca could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA fetchBygetManuFacturingBy_CaseId(
		String caseId) {

		return fetchBygetManuFacturingBy_CaseId(caseId, true);
	}

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing recommendation to jca, or <code>null</code> if a matching manufacturing recommendation to jca could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA fetchBygetManuFacturingBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManuFacturingBy_CaseId, finderArgs, this);
		}

		if (result instanceof ManufacturingRecommendationToJCA) {
			ManufacturingRecommendationToJCA manufacturingRecommendationToJCA =
				(ManufacturingRecommendationToJCA)result;

			if (!Objects.equals(
					caseId, manufacturingRecommendationToJCA.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUFACTURINGRECOMMENDATIONTOJCA_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBY_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<ManufacturingRecommendationToJCA> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManuFacturingBy_CaseId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"ManufacturingRecommendationToJCAPersistenceImpl.fetchBygetManuFacturingBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingRecommendationToJCA
						manufacturingRecommendationToJCA = list.get(0);

					result = manufacturingRecommendationToJCA;

					cacheResult(manufacturingRecommendationToJCA);
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
			return (ManufacturingRecommendationToJCA)result;
		}
	}

	/**
	 * Removes the manufacturing recommendation to jca where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing recommendation to jca that was removed
	 */
	@Override
	public ManufacturingRecommendationToJCA removeBygetManuFacturingBy_CaseId(
			String caseId)
		throws NoSuchManufacturingRecommendationToJCAException {

		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA =
			findBygetManuFacturingBy_CaseId(caseId);

		return remove(manufacturingRecommendationToJCA);
	}

	/**
	 * Returns the number of manufacturing recommendation to jcas where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing recommendation to jcas
	 */
	@Override
	public int countBygetManuFacturingBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetManuFacturingBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGRECOMMENDATIONTOJCA_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBY_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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
		_FINDER_COLUMN_GETMANUFACTURINGBY_CASEID_CASEID_2 =
			"manufacturingRecommendationToJCA.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBY_CASEID_CASEID_3 =
			"(manufacturingRecommendationToJCA.caseId IS NULL OR manufacturingRecommendationToJCA.caseId = '')";

	public ManufacturingRecommendationToJCAPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("date", "date_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ManufacturingRecommendationToJCA.class);

		setModelImplClass(ManufacturingRecommendationToJCAImpl.class);
		setModelPKClass(long.class);

		setTable(ManufacturingRecommendationToJCATable.INSTANCE);
	}

	/**
	 * Caches the manufacturing recommendation to jca in the entity cache if it is enabled.
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 */
	@Override
	public void cacheResult(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		entityCache.putResult(
			ManufacturingRecommendationToJCAImpl.class,
			manufacturingRecommendationToJCA.getPrimaryKey(),
			manufacturingRecommendationToJCA);

		finderCache.putResult(
			_finderPathFetchBygetManuFacturingBy_CaseId,
			new Object[] {manufacturingRecommendationToJCA.getCaseId()},
			manufacturingRecommendationToJCA);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manufacturing recommendation to jcas in the entity cache if it is enabled.
	 *
	 * @param manufacturingRecommendationToJCAs the manufacturing recommendation to jcas
	 */
	@Override
	public void cacheResult(
		List<ManufacturingRecommendationToJCA>
			manufacturingRecommendationToJCAs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manufacturingRecommendationToJCAs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManufacturingRecommendationToJCA manufacturingRecommendationToJCA :
				manufacturingRecommendationToJCAs) {

			if (entityCache.getResult(
					ManufacturingRecommendationToJCAImpl.class,
					manufacturingRecommendationToJCA.getPrimaryKey()) == null) {

				cacheResult(manufacturingRecommendationToJCA);
			}
		}
	}

	/**
	 * Clears the cache for all manufacturing recommendation to jcas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManufacturingRecommendationToJCAImpl.class);

		finderCache.clearCache(ManufacturingRecommendationToJCAImpl.class);
	}

	/**
	 * Clears the cache for the manufacturing recommendation to jca.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		entityCache.removeResult(
			ManufacturingRecommendationToJCAImpl.class,
			manufacturingRecommendationToJCA);
	}

	@Override
	public void clearCache(
		List<ManufacturingRecommendationToJCA>
			manufacturingRecommendationToJCAs) {

		for (ManufacturingRecommendationToJCA manufacturingRecommendationToJCA :
				manufacturingRecommendationToJCAs) {

			entityCache.removeResult(
				ManufacturingRecommendationToJCAImpl.class,
				manufacturingRecommendationToJCA);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManufacturingRecommendationToJCAImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManufacturingRecommendationToJCAImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManufacturingRecommendationToJCAModelImpl
			manufacturingRecommendationToJCAModelImpl) {

		Object[] args = new Object[] {
			manufacturingRecommendationToJCAModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetManuFacturingBy_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManuFacturingBy_CaseId, args,
			manufacturingRecommendationToJCAModelImpl);
	}

	/**
	 * Creates a new manufacturing recommendation to jca with the primary key. Does not add the manufacturing recommendation to jca to the database.
	 *
	 * @param manufacturingJCAId the primary key for the new manufacturing recommendation to jca
	 * @return the new manufacturing recommendation to jca
	 */
	@Override
	public ManufacturingRecommendationToJCA create(long manufacturingJCAId) {
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA =
			new ManufacturingRecommendationToJCAImpl();

		manufacturingRecommendationToJCA.setNew(true);
		manufacturingRecommendationToJCA.setPrimaryKey(manufacturingJCAId);

		manufacturingRecommendationToJCA.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manufacturingRecommendationToJCA;
	}

	/**
	 * Removes the manufacturing recommendation to jca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA remove(long manufacturingJCAId)
		throws NoSuchManufacturingRecommendationToJCAException {

		return remove((Serializable)manufacturingJCAId);
	}

	/**
	 * Removes the manufacturing recommendation to jca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA remove(Serializable primaryKey)
		throws NoSuchManufacturingRecommendationToJCAException {

		Session session = null;

		try {
			session = openSession();

			ManufacturingRecommendationToJCA manufacturingRecommendationToJCA =
				(ManufacturingRecommendationToJCA)session.get(
					ManufacturingRecommendationToJCAImpl.class, primaryKey);

			if (manufacturingRecommendationToJCA == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManufacturingRecommendationToJCAException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manufacturingRecommendationToJCA);
		}
		catch (NoSuchManufacturingRecommendationToJCAException
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
	protected ManufacturingRecommendationToJCA removeImpl(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manufacturingRecommendationToJCA)) {
				manufacturingRecommendationToJCA =
					(ManufacturingRecommendationToJCA)session.get(
						ManufacturingRecommendationToJCAImpl.class,
						manufacturingRecommendationToJCA.getPrimaryKeyObj());
			}

			if (manufacturingRecommendationToJCA != null) {
				session.delete(manufacturingRecommendationToJCA);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manufacturingRecommendationToJCA != null) {
			clearCache(manufacturingRecommendationToJCA);
		}

		return manufacturingRecommendationToJCA;
	}

	@Override
	public ManufacturingRecommendationToJCA updateImpl(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		boolean isNew = manufacturingRecommendationToJCA.isNew();

		if (!(manufacturingRecommendationToJCA instanceof
				ManufacturingRecommendationToJCAModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					manufacturingRecommendationToJCA.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					manufacturingRecommendationToJCA);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manufacturingRecommendationToJCA proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManufacturingRecommendationToJCA implementation " +
					manufacturingRecommendationToJCA.getClass());
		}

		ManufacturingRecommendationToJCAModelImpl
			manufacturingRecommendationToJCAModelImpl =
				(ManufacturingRecommendationToJCAModelImpl)
					manufacturingRecommendationToJCA;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(manufacturingRecommendationToJCA.getCreateDate() == null)) {

			if (serviceContext == null) {
				manufacturingRecommendationToJCA.setCreateDate(date);
			}
			else {
				manufacturingRecommendationToJCA.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manufacturingRecommendationToJCAModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manufacturingRecommendationToJCA.setModifiedDate(date);
			}
			else {
				manufacturingRecommendationToJCA.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manufacturingRecommendationToJCA);
			}
			else {
				manufacturingRecommendationToJCA =
					(ManufacturingRecommendationToJCA)session.merge(
						manufacturingRecommendationToJCA);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManufacturingRecommendationToJCAImpl.class,
			manufacturingRecommendationToJCAModelImpl, false, true);

		cacheUniqueFindersCache(manufacturingRecommendationToJCAModelImpl);

		if (isNew) {
			manufacturingRecommendationToJCA.setNew(false);
		}

		manufacturingRecommendationToJCA.resetOriginalValues();

		return manufacturingRecommendationToJCA;
	}

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchManufacturingRecommendationToJCAException {

		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA =
			fetchByPrimaryKey(primaryKey);

		if (manufacturingRecommendationToJCA == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManufacturingRecommendationToJCAException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manufacturingRecommendationToJCA;
	}

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or throws a <code>NoSuchManufacturingRecommendationToJCAException</code> if it could not be found.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA findByPrimaryKey(
			long manufacturingJCAId)
		throws NoSuchManufacturingRecommendationToJCAException {

		return findByPrimaryKey((Serializable)manufacturingJCAId);
	}

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca, or <code>null</code> if a manufacturing recommendation to jca with the primary key could not be found
	 */
	@Override
	public ManufacturingRecommendationToJCA fetchByPrimaryKey(
		long manufacturingJCAId) {

		return fetchByPrimaryKey((Serializable)manufacturingJCAId);
	}

	/**
	 * Returns all the manufacturing recommendation to jcas.
	 *
	 * @return the manufacturing recommendation to jcas
	 */
	@Override
	public List<ManufacturingRecommendationToJCA> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @return the range of manufacturing recommendation to jcas
	 */
	@Override
	public List<ManufacturingRecommendationToJCA> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing recommendation to jcas
	 */
	@Override
	public List<ManufacturingRecommendationToJCA> findAll(
		int start, int end,
		OrderByComparator<ManufacturingRecommendationToJCA> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing recommendation to jcas
	 */
	@Override
	public List<ManufacturingRecommendationToJCA> findAll(
		int start, int end,
		OrderByComparator<ManufacturingRecommendationToJCA> orderByComparator,
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

		List<ManufacturingRecommendationToJCA> list = null;

		if (useFinderCache) {
			list =
				(List<ManufacturingRecommendationToJCA>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUFACTURINGRECOMMENDATIONTOJCA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUFACTURINGRECOMMENDATIONTOJCA;

				sql = sql.concat(
					ManufacturingRecommendationToJCAModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManufacturingRecommendationToJCA>)QueryUtil.list(
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
	 * Removes all the manufacturing recommendation to jcas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManufacturingRecommendationToJCA manufacturingRecommendationToJCA :
				findAll()) {

			remove(manufacturingRecommendationToJCA);
		}
	}

	/**
	 * Returns the number of manufacturing recommendation to jcas.
	 *
	 * @return the number of manufacturing recommendation to jcas
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
					_SQL_COUNT_MANUFACTURINGRECOMMENDATIONTOJCA);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "manufacturingJCAId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUFACTURINGRECOMMENDATIONTOJCA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManufacturingRecommendationToJCAModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manufacturing recommendation to jca persistence.
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

		_finderPathFetchBygetManuFacturingBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManuFacturingBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetManuFacturingBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManuFacturingBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		ManufacturingRecommendationToJCAUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManufacturingRecommendationToJCAUtil.setPersistence(null);

		entityCache.removeCache(
			ManufacturingRecommendationToJCAImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUFACTURINGRECOMMENDATIONTOJCA =
		"SELECT manufacturingRecommendationToJCA FROM ManufacturingRecommendationToJCA manufacturingRecommendationToJCA";

	private static final String
		_SQL_SELECT_MANUFACTURINGRECOMMENDATIONTOJCA_WHERE =
			"SELECT manufacturingRecommendationToJCA FROM ManufacturingRecommendationToJCA manufacturingRecommendationToJCA WHERE ";

	private static final String _SQL_COUNT_MANUFACTURINGRECOMMENDATIONTOJCA =
		"SELECT COUNT(manufacturingRecommendationToJCA) FROM ManufacturingRecommendationToJCA manufacturingRecommendationToJCA";

	private static final String
		_SQL_COUNT_MANUFACTURINGRECOMMENDATIONTOJCA_WHERE =
			"SELECT COUNT(manufacturingRecommendationToJCA) FROM ManufacturingRecommendationToJCA manufacturingRecommendationToJCA WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manufacturingRecommendationToJCA.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManufacturingRecommendationToJCA exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManufacturingRecommendationToJCA exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManufacturingRecommendationToJCAPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"date"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}