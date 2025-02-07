/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence.impl;

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

import com.nbp.miic.stages.service.exception.NoSuchMiicCertificateOfIssuanceException;
import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;
import com.nbp.miic.stages.service.model.MiicCertificateOfIssuanceTable;
import com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceImpl;
import com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl;
import com.nbp.miic.stages.service.service.persistence.MiicCertificateOfIssuancePersistence;
import com.nbp.miic.stages.service.service.persistence.MiicCertificateOfIssuanceUtil;
import com.nbp.miic.stages.service.service.persistence.impl.constants.MIIC_APPLICATION_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
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
 * The persistence implementation for the miic certificate of issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicCertificateOfIssuancePersistence.class)
public class MiicCertificateOfIssuancePersistenceImpl
	extends BasePersistenceImpl<MiicCertificateOfIssuance>
	implements MiicCertificateOfIssuancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicCertificateOfIssuanceUtil</code> to access the miic certificate of issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicCertificateOfIssuanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMiic_CI_by_CI;
	private FinderPath _finderPathCountBygetMiic_CI_by_CI;

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or throws a <code>NoSuchMiicCertificateOfIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a matching miic certificate of issuance could not be found
	 */
	@Override
	public MiicCertificateOfIssuance findBygetMiic_CI_by_CI(String caseId)
		throws NoSuchMiicCertificateOfIssuanceException {

		MiicCertificateOfIssuance miicCertificateOfIssuance =
			fetchBygetMiic_CI_by_CI(caseId);

		if (miicCertificateOfIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicCertificateOfIssuanceException(sb.toString());
		}

		return miicCertificateOfIssuance;
	}

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic certificate of issuance, or <code>null</code> if a matching miic certificate of issuance could not be found
	 */
	@Override
	public MiicCertificateOfIssuance fetchBygetMiic_CI_by_CI(String caseId) {
		return fetchBygetMiic_CI_by_CI(caseId, true);
	}

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic certificate of issuance, or <code>null</code> if a matching miic certificate of issuance could not be found
	 */
	@Override
	public MiicCertificateOfIssuance fetchBygetMiic_CI_by_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiic_CI_by_CI, finderArgs, this);
		}

		if (result instanceof MiicCertificateOfIssuance) {
			MiicCertificateOfIssuance miicCertificateOfIssuance =
				(MiicCertificateOfIssuance)result;

			if (!Objects.equals(
					caseId, miicCertificateOfIssuance.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICCERTIFICATEOFISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CI_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CI_BY_CI_CASEID_2);
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

				List<MiicCertificateOfIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiic_CI_by_CI, finderArgs,
							list);
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
								"MiicCertificateOfIssuancePersistenceImpl.fetchBygetMiic_CI_by_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicCertificateOfIssuance miicCertificateOfIssuance =
						list.get(0);

					result = miicCertificateOfIssuance;

					cacheResult(miicCertificateOfIssuance);
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
			return (MiicCertificateOfIssuance)result;
		}
	}

	/**
	 * Removes the miic certificate of issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic certificate of issuance that was removed
	 */
	@Override
	public MiicCertificateOfIssuance removeBygetMiic_CI_by_CI(String caseId)
		throws NoSuchMiicCertificateOfIssuanceException {

		MiicCertificateOfIssuance miicCertificateOfIssuance =
			findBygetMiic_CI_by_CI(caseId);

		return remove(miicCertificateOfIssuance);
	}

	/**
	 * Returns the number of miic certificate of issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic certificate of issuances
	 */
	@Override
	public int countBygetMiic_CI_by_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMiic_CI_by_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICCERTIFICATEOFISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_CI_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_CI_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMIIC_CI_BY_CI_CASEID_2 =
		"miicCertificateOfIssuance.caseId = ?";

	private static final String _FINDER_COLUMN_GETMIIC_CI_BY_CI_CASEID_3 =
		"(miicCertificateOfIssuance.caseId IS NULL OR miicCertificateOfIssuance.caseId = '')";

	public MiicCertificateOfIssuancePersistenceImpl() {
		setModelClass(MiicCertificateOfIssuance.class);

		setModelImplClass(MiicCertificateOfIssuanceImpl.class);
		setModelPKClass(long.class);

		setTable(MiicCertificateOfIssuanceTable.INSTANCE);
	}

	/**
	 * Caches the miic certificate of issuance in the entity cache if it is enabled.
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 */
	@Override
	public void cacheResult(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		entityCache.putResult(
			MiicCertificateOfIssuanceImpl.class,
			miicCertificateOfIssuance.getPrimaryKey(),
			miicCertificateOfIssuance);

		finderCache.putResult(
			_finderPathFetchBygetMiic_CI_by_CI,
			new Object[] {miicCertificateOfIssuance.getCaseId()},
			miicCertificateOfIssuance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic certificate of issuances in the entity cache if it is enabled.
	 *
	 * @param miicCertificateOfIssuances the miic certificate of issuances
	 */
	@Override
	public void cacheResult(
		List<MiicCertificateOfIssuance> miicCertificateOfIssuances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicCertificateOfIssuances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicCertificateOfIssuance miicCertificateOfIssuance :
				miicCertificateOfIssuances) {

			if (entityCache.getResult(
					MiicCertificateOfIssuanceImpl.class,
					miicCertificateOfIssuance.getPrimaryKey()) == null) {

				cacheResult(miicCertificateOfIssuance);
			}
		}
	}

	/**
	 * Clears the cache for all miic certificate of issuances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicCertificateOfIssuanceImpl.class);

		finderCache.clearCache(MiicCertificateOfIssuanceImpl.class);
	}

	/**
	 * Clears the cache for the miic certificate of issuance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		entityCache.removeResult(
			MiicCertificateOfIssuanceImpl.class, miicCertificateOfIssuance);
	}

	@Override
	public void clearCache(
		List<MiicCertificateOfIssuance> miicCertificateOfIssuances) {

		for (MiicCertificateOfIssuance miicCertificateOfIssuance :
				miicCertificateOfIssuances) {

			entityCache.removeResult(
				MiicCertificateOfIssuanceImpl.class, miicCertificateOfIssuance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicCertificateOfIssuanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicCertificateOfIssuanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicCertificateOfIssuanceModelImpl miicCertificateOfIssuanceModelImpl) {

		Object[] args = new Object[] {
			miicCertificateOfIssuanceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiic_CI_by_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiic_CI_by_CI, args,
			miicCertificateOfIssuanceModelImpl);
	}

	/**
	 * Creates a new miic certificate of issuance with the primary key. Does not add the miic certificate of issuance to the database.
	 *
	 * @param miicCertificateOfIssuanceId the primary key for the new miic certificate of issuance
	 * @return the new miic certificate of issuance
	 */
	@Override
	public MiicCertificateOfIssuance create(long miicCertificateOfIssuanceId) {
		MiicCertificateOfIssuance miicCertificateOfIssuance =
			new MiicCertificateOfIssuanceImpl();

		miicCertificateOfIssuance.setNew(true);
		miicCertificateOfIssuance.setPrimaryKey(miicCertificateOfIssuanceId);

		miicCertificateOfIssuance.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miicCertificateOfIssuance;
	}

	/**
	 * Removes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public MiicCertificateOfIssuance remove(long miicCertificateOfIssuanceId)
		throws NoSuchMiicCertificateOfIssuanceException {

		return remove((Serializable)miicCertificateOfIssuanceId);
	}

	/**
	 * Removes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public MiicCertificateOfIssuance remove(Serializable primaryKey)
		throws NoSuchMiicCertificateOfIssuanceException {

		Session session = null;

		try {
			session = openSession();

			MiicCertificateOfIssuance miicCertificateOfIssuance =
				(MiicCertificateOfIssuance)session.get(
					MiicCertificateOfIssuanceImpl.class, primaryKey);

			if (miicCertificateOfIssuance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicCertificateOfIssuanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicCertificateOfIssuance);
		}
		catch (NoSuchMiicCertificateOfIssuanceException noSuchEntityException) {
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
	protected MiicCertificateOfIssuance removeImpl(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicCertificateOfIssuance)) {
				miicCertificateOfIssuance =
					(MiicCertificateOfIssuance)session.get(
						MiicCertificateOfIssuanceImpl.class,
						miicCertificateOfIssuance.getPrimaryKeyObj());
			}

			if (miicCertificateOfIssuance != null) {
				session.delete(miicCertificateOfIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicCertificateOfIssuance != null) {
			clearCache(miicCertificateOfIssuance);
		}

		return miicCertificateOfIssuance;
	}

	@Override
	public MiicCertificateOfIssuance updateImpl(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		boolean isNew = miicCertificateOfIssuance.isNew();

		if (!(miicCertificateOfIssuance instanceof
				MiicCertificateOfIssuanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicCertificateOfIssuance.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicCertificateOfIssuance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicCertificateOfIssuance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicCertificateOfIssuance implementation " +
					miicCertificateOfIssuance.getClass());
		}

		MiicCertificateOfIssuanceModelImpl miicCertificateOfIssuanceModelImpl =
			(MiicCertificateOfIssuanceModelImpl)miicCertificateOfIssuance;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicCertificateOfIssuance.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicCertificateOfIssuance.setCreateDate(date);
			}
			else {
				miicCertificateOfIssuance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicCertificateOfIssuanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicCertificateOfIssuance.setModifiedDate(date);
			}
			else {
				miicCertificateOfIssuance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicCertificateOfIssuance);
			}
			else {
				miicCertificateOfIssuance =
					(MiicCertificateOfIssuance)session.merge(
						miicCertificateOfIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicCertificateOfIssuanceImpl.class,
			miicCertificateOfIssuanceModelImpl, false, true);

		cacheUniqueFindersCache(miicCertificateOfIssuanceModelImpl);

		if (isNew) {
			miicCertificateOfIssuance.setNew(false);
		}

		miicCertificateOfIssuance.resetOriginalValues();

		return miicCertificateOfIssuance;
	}

	/**
	 * Returns the miic certificate of issuance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public MiicCertificateOfIssuance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicCertificateOfIssuanceException {

		MiicCertificateOfIssuance miicCertificateOfIssuance = fetchByPrimaryKey(
			primaryKey);

		if (miicCertificateOfIssuance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicCertificateOfIssuanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicCertificateOfIssuance;
	}

	/**
	 * Returns the miic certificate of issuance with the primary key or throws a <code>NoSuchMiicCertificateOfIssuanceException</code> if it could not be found.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public MiicCertificateOfIssuance findByPrimaryKey(
			long miicCertificateOfIssuanceId)
		throws NoSuchMiicCertificateOfIssuanceException {

		return findByPrimaryKey((Serializable)miicCertificateOfIssuanceId);
	}

	/**
	 * Returns the miic certificate of issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance, or <code>null</code> if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public MiicCertificateOfIssuance fetchByPrimaryKey(
		long miicCertificateOfIssuanceId) {

		return fetchByPrimaryKey((Serializable)miicCertificateOfIssuanceId);
	}

	/**
	 * Returns all the miic certificate of issuances.
	 *
	 * @return the miic certificate of issuances
	 */
	@Override
	public List<MiicCertificateOfIssuance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @return the range of miic certificate of issuances
	 */
	@Override
	public List<MiicCertificateOfIssuance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic certificate of issuances
	 */
	@Override
	public List<MiicCertificateOfIssuance> findAll(
		int start, int end,
		OrderByComparator<MiicCertificateOfIssuance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic certificate of issuances
	 */
	@Override
	public List<MiicCertificateOfIssuance> findAll(
		int start, int end,
		OrderByComparator<MiicCertificateOfIssuance> orderByComparator,
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

		List<MiicCertificateOfIssuance> list = null;

		if (useFinderCache) {
			list = (List<MiicCertificateOfIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICCERTIFICATEOFISSUANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICCERTIFICATEOFISSUANCE;

				sql = sql.concat(
					MiicCertificateOfIssuanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicCertificateOfIssuance>)QueryUtil.list(
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
	 * Removes all the miic certificate of issuances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicCertificateOfIssuance miicCertificateOfIssuance : findAll()) {
			remove(miicCertificateOfIssuance);
		}
	}

	/**
	 * Returns the number of miic certificate of issuances.
	 *
	 * @return the number of miic certificate of issuances
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
					_SQL_COUNT_MIICCERTIFICATEOFISSUANCE);

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
		return "miicCertificateOfIssuanceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICCERTIFICATEOFISSUANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicCertificateOfIssuanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic certificate of issuance persistence.
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

		_finderPathFetchBygetMiic_CI_by_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiic_CI_by_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMiic_CI_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiic_CI_by_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		MiicCertificateOfIssuanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicCertificateOfIssuanceUtil.setPersistence(null);

		entityCache.removeCache(MiicCertificateOfIssuanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICCERTIFICATEOFISSUANCE =
		"SELECT miicCertificateOfIssuance FROM MiicCertificateOfIssuance miicCertificateOfIssuance";

	private static final String _SQL_SELECT_MIICCERTIFICATEOFISSUANCE_WHERE =
		"SELECT miicCertificateOfIssuance FROM MiicCertificateOfIssuance miicCertificateOfIssuance WHERE ";

	private static final String _SQL_COUNT_MIICCERTIFICATEOFISSUANCE =
		"SELECT COUNT(miicCertificateOfIssuance) FROM MiicCertificateOfIssuance miicCertificateOfIssuance";

	private static final String _SQL_COUNT_MIICCERTIFICATEOFISSUANCE_WHERE =
		"SELECT COUNT(miicCertificateOfIssuance) FROM MiicCertificateOfIssuance miicCertificateOfIssuance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicCertificateOfIssuance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicCertificateOfIssuance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicCertificateOfIssuance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicCertificateOfIssuancePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}