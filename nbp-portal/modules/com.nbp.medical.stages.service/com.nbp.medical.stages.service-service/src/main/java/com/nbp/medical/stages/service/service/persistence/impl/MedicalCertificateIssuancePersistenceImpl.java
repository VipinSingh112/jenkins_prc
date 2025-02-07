/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence.impl;

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

import com.nbp.medical.stages.service.exception.NoSuchMedicalCertificateIssuanceException;
import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;
import com.nbp.medical.stages.service.model.MedicalCertificateIssuanceTable;
import com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceImpl;
import com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl;
import com.nbp.medical.stages.service.service.persistence.MedicalCertificateIssuancePersistence;
import com.nbp.medical.stages.service.service.persistence.MedicalCertificateIssuanceUtil;
import com.nbp.medical.stages.service.service.persistence.impl.constants.MEDICAL_STAGESPersistenceConstants;

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
 * The persistence implementation for the medical certificate issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalCertificateIssuancePersistence.class)
public class MedicalCertificateIssuancePersistenceImpl
	extends BasePersistenceImpl<MedicalCertificateIssuance>
	implements MedicalCertificateIssuancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalCertificateIssuanceUtil</code> to access the medical certificate issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalCertificateIssuanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMedical_Issuance_By_CI;
	private FinderPath _finderPathCountBygetMedical_Issuance_By_CI;

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or throws a <code>NoSuchMedicalCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a matching medical certificate issuance could not be found
	 */
	@Override
	public MedicalCertificateIssuance findBygetMedical_Issuance_By_CI(
			String caseId)
		throws NoSuchMedicalCertificateIssuanceException {

		MedicalCertificateIssuance medicalCertificateIssuance =
			fetchBygetMedical_Issuance_By_CI(caseId);

		if (medicalCertificateIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalCertificateIssuanceException(sb.toString());
		}

		return medicalCertificateIssuance;
	}

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical certificate issuance, or <code>null</code> if a matching medical certificate issuance could not be found
	 */
	@Override
	public MedicalCertificateIssuance fetchBygetMedical_Issuance_By_CI(
		String caseId) {

		return fetchBygetMedical_Issuance_By_CI(caseId, true);
	}

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical certificate issuance, or <code>null</code> if a matching medical certificate issuance could not be found
	 */
	@Override
	public MedicalCertificateIssuance fetchBygetMedical_Issuance_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedical_Issuance_By_CI, finderArgs, this);
		}

		if (result instanceof MedicalCertificateIssuance) {
			MedicalCertificateIssuance medicalCertificateIssuance =
				(MedicalCertificateIssuance)result;

			if (!Objects.equals(
					caseId, medicalCertificateIssuance.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALCERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICAL_ISSUANCE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICAL_ISSUANCE_BY_CI_CASEID_2);
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

				List<MedicalCertificateIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedical_Issuance_By_CI,
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
								"MedicalCertificateIssuancePersistenceImpl.fetchBygetMedical_Issuance_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalCertificateIssuance medicalCertificateIssuance =
						list.get(0);

					result = medicalCertificateIssuance;

					cacheResult(medicalCertificateIssuance);
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
			return (MedicalCertificateIssuance)result;
		}
	}

	/**
	 * Removes the medical certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical certificate issuance that was removed
	 */
	@Override
	public MedicalCertificateIssuance removeBygetMedical_Issuance_By_CI(
			String caseId)
		throws NoSuchMedicalCertificateIssuanceException {

		MedicalCertificateIssuance medicalCertificateIssuance =
			findBygetMedical_Issuance_By_CI(caseId);

		return remove(medicalCertificateIssuance);
	}

	/**
	 * Returns the number of medical certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical certificate issuances
	 */
	@Override
	public int countBygetMedical_Issuance_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMedical_Issuance_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALCERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICAL_ISSUANCE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICAL_ISSUANCE_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETMEDICAL_ISSUANCE_BY_CI_CASEID_2 =
			"medicalCertificateIssuance.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICAL_ISSUANCE_BY_CI_CASEID_3 =
			"(medicalCertificateIssuance.caseId IS NULL OR medicalCertificateIssuance.caseId = '')";

	public MedicalCertificateIssuancePersistenceImpl() {
		setModelClass(MedicalCertificateIssuance.class);

		setModelImplClass(MedicalCertificateIssuanceImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalCertificateIssuanceTable.INSTANCE);
	}

	/**
	 * Caches the medical certificate issuance in the entity cache if it is enabled.
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 */
	@Override
	public void cacheResult(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		entityCache.putResult(
			MedicalCertificateIssuanceImpl.class,
			medicalCertificateIssuance.getPrimaryKey(),
			medicalCertificateIssuance);

		finderCache.putResult(
			_finderPathFetchBygetMedical_Issuance_By_CI,
			new Object[] {medicalCertificateIssuance.getCaseId()},
			medicalCertificateIssuance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical certificate issuances in the entity cache if it is enabled.
	 *
	 * @param medicalCertificateIssuances the medical certificate issuances
	 */
	@Override
	public void cacheResult(
		List<MedicalCertificateIssuance> medicalCertificateIssuances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalCertificateIssuances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalCertificateIssuance medicalCertificateIssuance :
				medicalCertificateIssuances) {

			if (entityCache.getResult(
					MedicalCertificateIssuanceImpl.class,
					medicalCertificateIssuance.getPrimaryKey()) == null) {

				cacheResult(medicalCertificateIssuance);
			}
		}
	}

	/**
	 * Clears the cache for all medical certificate issuances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalCertificateIssuanceImpl.class);

		finderCache.clearCache(MedicalCertificateIssuanceImpl.class);
	}

	/**
	 * Clears the cache for the medical certificate issuance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		entityCache.removeResult(
			MedicalCertificateIssuanceImpl.class, medicalCertificateIssuance);
	}

	@Override
	public void clearCache(
		List<MedicalCertificateIssuance> medicalCertificateIssuances) {

		for (MedicalCertificateIssuance medicalCertificateIssuance :
				medicalCertificateIssuances) {

			entityCache.removeResult(
				MedicalCertificateIssuanceImpl.class,
				medicalCertificateIssuance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalCertificateIssuanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalCertificateIssuanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalCertificateIssuanceModelImpl
			medicalCertificateIssuanceModelImpl) {

		Object[] args = new Object[] {
			medicalCertificateIssuanceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedical_Issuance_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedical_Issuance_By_CI, args,
			medicalCertificateIssuanceModelImpl);
	}

	/**
	 * Creates a new medical certificate issuance with the primary key. Does not add the medical certificate issuance to the database.
	 *
	 * @param medicalCertificateIssuanceId the primary key for the new medical certificate issuance
	 * @return the new medical certificate issuance
	 */
	@Override
	public MedicalCertificateIssuance create(
		long medicalCertificateIssuanceId) {

		MedicalCertificateIssuance medicalCertificateIssuance =
			new MedicalCertificateIssuanceImpl();

		medicalCertificateIssuance.setNew(true);
		medicalCertificateIssuance.setPrimaryKey(medicalCertificateIssuanceId);

		medicalCertificateIssuance.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalCertificateIssuance;
	}

	/**
	 * Removes the medical certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public MedicalCertificateIssuance remove(long medicalCertificateIssuanceId)
		throws NoSuchMedicalCertificateIssuanceException {

		return remove((Serializable)medicalCertificateIssuanceId);
	}

	/**
	 * Removes the medical certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public MedicalCertificateIssuance remove(Serializable primaryKey)
		throws NoSuchMedicalCertificateIssuanceException {

		Session session = null;

		try {
			session = openSession();

			MedicalCertificateIssuance medicalCertificateIssuance =
				(MedicalCertificateIssuance)session.get(
					MedicalCertificateIssuanceImpl.class, primaryKey);

			if (medicalCertificateIssuance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalCertificateIssuanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalCertificateIssuance);
		}
		catch (NoSuchMedicalCertificateIssuanceException
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
	protected MedicalCertificateIssuance removeImpl(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalCertificateIssuance)) {
				medicalCertificateIssuance =
					(MedicalCertificateIssuance)session.get(
						MedicalCertificateIssuanceImpl.class,
						medicalCertificateIssuance.getPrimaryKeyObj());
			}

			if (medicalCertificateIssuance != null) {
				session.delete(medicalCertificateIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalCertificateIssuance != null) {
			clearCache(medicalCertificateIssuance);
		}

		return medicalCertificateIssuance;
	}

	@Override
	public MedicalCertificateIssuance updateImpl(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		boolean isNew = medicalCertificateIssuance.isNew();

		if (!(medicalCertificateIssuance instanceof
				MedicalCertificateIssuanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalCertificateIssuance.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalCertificateIssuance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalCertificateIssuance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalCertificateIssuance implementation " +
					medicalCertificateIssuance.getClass());
		}

		MedicalCertificateIssuanceModelImpl
			medicalCertificateIssuanceModelImpl =
				(MedicalCertificateIssuanceModelImpl)medicalCertificateIssuance;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalCertificateIssuance.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalCertificateIssuance.setCreateDate(date);
			}
			else {
				medicalCertificateIssuance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalCertificateIssuanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalCertificateIssuance.setModifiedDate(date);
			}
			else {
				medicalCertificateIssuance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalCertificateIssuance);
			}
			else {
				medicalCertificateIssuance =
					(MedicalCertificateIssuance)session.merge(
						medicalCertificateIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalCertificateIssuanceImpl.class,
			medicalCertificateIssuanceModelImpl, false, true);

		cacheUniqueFindersCache(medicalCertificateIssuanceModelImpl);

		if (isNew) {
			medicalCertificateIssuance.setNew(false);
		}

		medicalCertificateIssuance.resetOriginalValues();

		return medicalCertificateIssuance;
	}

	/**
	 * Returns the medical certificate issuance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical certificate issuance
	 * @return the medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public MedicalCertificateIssuance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalCertificateIssuanceException {

		MedicalCertificateIssuance medicalCertificateIssuance =
			fetchByPrimaryKey(primaryKey);

		if (medicalCertificateIssuance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalCertificateIssuanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalCertificateIssuance;
	}

	/**
	 * Returns the medical certificate issuance with the primary key or throws a <code>NoSuchMedicalCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public MedicalCertificateIssuance findByPrimaryKey(
			long medicalCertificateIssuanceId)
		throws NoSuchMedicalCertificateIssuanceException {

		return findByPrimaryKey((Serializable)medicalCertificateIssuanceId);
	}

	/**
	 * Returns the medical certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance, or <code>null</code> if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public MedicalCertificateIssuance fetchByPrimaryKey(
		long medicalCertificateIssuanceId) {

		return fetchByPrimaryKey((Serializable)medicalCertificateIssuanceId);
	}

	/**
	 * Returns all the medical certificate issuances.
	 *
	 * @return the medical certificate issuances
	 */
	@Override
	public List<MedicalCertificateIssuance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @return the range of medical certificate issuances
	 */
	@Override
	public List<MedicalCertificateIssuance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical certificate issuances
	 */
	@Override
	public List<MedicalCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<MedicalCertificateIssuance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical certificate issuances
	 */
	@Override
	public List<MedicalCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<MedicalCertificateIssuance> orderByComparator,
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

		List<MedicalCertificateIssuance> list = null;

		if (useFinderCache) {
			list = (List<MedicalCertificateIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALCERTIFICATEISSUANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALCERTIFICATEISSUANCE;

				sql = sql.concat(
					MedicalCertificateIssuanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalCertificateIssuance>)QueryUtil.list(
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
	 * Removes all the medical certificate issuances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalCertificateIssuance medicalCertificateIssuance :
				findAll()) {

			remove(medicalCertificateIssuance);
		}
	}

	/**
	 * Returns the number of medical certificate issuances.
	 *
	 * @return the number of medical certificate issuances
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
					_SQL_COUNT_MEDICALCERTIFICATEISSUANCE);

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
		return "medicalCertificateIssuanceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALCERTIFICATEISSUANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalCertificateIssuanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical certificate issuance persistence.
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

		_finderPathFetchBygetMedical_Issuance_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedical_Issuance_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMedical_Issuance_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedical_Issuance_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		MedicalCertificateIssuanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalCertificateIssuanceUtil.setPersistence(null);

		entityCache.removeCache(MedicalCertificateIssuanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALCERTIFICATEISSUANCE =
		"SELECT medicalCertificateIssuance FROM MedicalCertificateIssuance medicalCertificateIssuance";

	private static final String _SQL_SELECT_MEDICALCERTIFICATEISSUANCE_WHERE =
		"SELECT medicalCertificateIssuance FROM MedicalCertificateIssuance medicalCertificateIssuance WHERE ";

	private static final String _SQL_COUNT_MEDICALCERTIFICATEISSUANCE =
		"SELECT COUNT(medicalCertificateIssuance) FROM MedicalCertificateIssuance medicalCertificateIssuance";

	private static final String _SQL_COUNT_MEDICALCERTIFICATEISSUANCE_WHERE =
		"SELECT COUNT(medicalCertificateIssuance) FROM MedicalCertificateIssuance medicalCertificateIssuance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalCertificateIssuance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalCertificateIssuance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalCertificateIssuance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalCertificateIssuancePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}